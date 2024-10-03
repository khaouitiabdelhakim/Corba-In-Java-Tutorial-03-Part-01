# Intégration des Objets et des Services
## TP3 - CORBA

This repository contains the third practical assignment (TP3) for the course "Intégration des Objets et des Services," focusing on the implementation of CORBA services.

### Prerequisites

Before working on this assignment, it is recommended to review the following tutorials to understand the basics of CORBA in Java:

- [CORBA in Java - Tutorial 01](https://github.com/khaouitiabdelhakim/Corba-In-Java-Tutorial-01)
- [CORBA in Java - Tutorial 02](https://github.com/khaouitiabdelhakim/Corba-In-Java-Tutorial-02)

### Exercice 1:

Extend the banking application to manage a bank account, allowing operations such as reading the account balance, crediting, and debiting the account. The task is to distinguish between two types of bank accounts:

1. **Current Account**: Characterized by an authorized overdraft.
2. **Savings Account**: Characterized by an interest rate.

Additionally, introduce a new type of account called **Remunerated Current Account**, which combines features from both the Current and Savings accounts.

The client will interact with the application through a menu that allows them to perform the following operations on the Remunerated Current Account:

- Read the account balance
- Credit the account
- Debit the account
- Read the interest rate
- Update the interest rate
- Read the overdraft authorization
- Update the overdraft authorization

### IDL File: banque.idl

```idl
// Description: Interfaces de l'application Banque
// TP3: mode d'implantation par heritage d'interface
// -----------------------------------------------------------------
interface Compte {
  float lire_montant();
  void crediter(in float somme_credit);
  void debiter(in float somme_debit);
};

interface CompteCourant : Compte {
  attribute boolean DecouvertAutorise;
};

interface CompteEpargne : Compte {
  attribute long taux;
};

interface CompteCourantRemunere : CompteCourant, CompteEpargne {};
```
