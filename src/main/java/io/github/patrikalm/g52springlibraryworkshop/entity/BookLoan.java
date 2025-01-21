package io.github.patrikalm.g52springlibraryworkshop.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private LocalDate loanDate;
    @Column
    private LocalDate dueDate;
    @Column
    private boolean returned;

    @ManyToOne
    @JoinColumn
    private AppUser borrower;

    @ManyToOne
    @JoinColumn
    private Book book;

    public BookLoan() {
    }

    public int getId() {
        return id;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public AppUser getBorrower() {
        return borrower;
    }

    public void setBorrower(AppUser borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
