//package com.sitepk.core;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//
//import javax.management.Query;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import com.sitepk.entity.Account;
//import com.sitepk.entity.Category;
//import com.sitepk.entity.Person;
//
//public class BookkeepingManager {
//
//    private final EntityManagerFactory factory;
//
//    private static class SingletonHolder {
//        static BookkeepingManager instance = new BookkeepingManager();
//    }
//
//    private BookkeepingManager() {
//        factory = Persistence.createEntityManagerFactory("bookkeeping");
//    }
//
//    public static BookkeepingManager getManager() {
//        return SingletonHolder.instance;
//    }
//
//    public void createPerson(Person person) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(person);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void updatePerson(Person person) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(person);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void deletePerson(int id) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(Person.class, id));
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public Person readPerson(int id) {
//        EntityManager em = factory.createEntityManager();
//        Person person = em.find(Person.class, id);
//        em.close();
//        return person;
//    }
//
//    public Person[] readAllPersons() {
//        EntityManager em = factory.createEntityManager();
//        Query q = em.createQuery("SELECT person FROM Person person");
//        List<Person> persons = q.getResultList();
//        em.close();
//        return persons.toArray(new Person[0]);
//    }
//
//    public Person readPersonByName(String name) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT person FROM Person person WHERE person.name = :name");
//        q.setParameter("name", name);
//        Person person = (Person) q.getSingleResult();
//        em.close();
//        return person;
//    }
//
//    public void createCategory(Category category) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(category);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void updateCategory(Category category) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(category);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void deleteCategory(int id) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(Category.class, id));
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public Category readCategory(int id) {
//        EntityManager em = factory.createEntityManager();
//        Category category = em.find(Category.class, id);
//        em.close();
//        return category;
//    }
//
//    public Category[] readAllCategories() {
//        EntityManager em = factory.createEntityManager();
//        Query q = em.createQuery("SELECT category FROM Category category");
//        List<Category> categories = q.getResultList();
//        em.close();
//        return categories.toArray(new Category[0]);
//    }
//
//    public Category readCategoryByName(String name) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT category FROM Category category WHERE category.name = :name");
//        q.setParameter("name", name);
//        Category category = (Category) q.getSingleResult();
//        em.close();
//        return category;
//    }
//
//    public void createAccount(Account account) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(account);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void updateAccount(Account account) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(account);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void deleteAccount(int id) {
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(Account.class, id));
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public Account readAccount(int id) {
//        EntityManager em = factory.createEntityManager();
//        Account account = em.find(Account.class, id);
//        em.close();
//        return account;
//    }
//
//    public Account[] readAllAccounts() {
//        EntityManager em = factory.createEntityManager();
//        Query q = em.createQuery("SELECT account FROM Account account");
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByPerson(int personId) {
//        EntityManager em = factory.createEntityManager();
//        Account[] accounts = em.find(Person.class, personId).getAccounts().toArray(
//                new Account[0]);
//        em.close();
//        return accounts;
//    }
//
//    public Account[] readAccountsByCategory(int categoryId) {
//        EntityManager em = factory.createEntityManager();
//        Account[] accounts = em.find(Category.class, categoryId).getAccounts().toArray(
//                new Account[0]);
//        em.close();
//        return accounts;
//    }
//
//    public Account[] readAccountsByDateBefore(Date endDate) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.date <= :endDate");
//        q.setParameter("endDate", endDate);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByDateBetween(Date beginDate, Date endDate) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.date BETWEEN :beginDate AND :endDate");
//        q.setParameter("beginDate", beginDate);
//        q.setParameter("endDate", endDate);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByDateAfter(Date beginDate) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.date >= :beginDate");
//        q.setParameter("beginDate", beginDate);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByAmountLessThan(BigDecimal upperBound) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.amount <= :upperBound");
//        q.setParameter("upperBound", upperBound);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByAmountBetween(BigDecimal lowerBound,
//            BigDecimal upperBound) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.amount BETWEEN :lowerBound AND :upperBound");
//        q.setParameter("lowerBound", lowerBound);
//        q.setParameter("upperBound", upperBound);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//    public Account[] readAccountsByAmountMoreThan(BigDecimal lowerBound) {
//        EntityManager em = factory.createEntityManager();
//        Query q = em
//                .createQuery("SELECT account FROM Account account WHERE account.amount >= :lowerBound");
//        q.setParameter("lowerBound", lowerBound);
//        List<Account> accounts = q.getResultList();
//        em.close();
//        return accounts.toArray(new Account[0]);
//    }
//
//}
