# Bookstore (Spring Modulith refactor)

## Goal
Refactor a simple modular monolith to keep `orders.internal` hidden, expose only a small API, and make Spring Modulith verification pass.

## Key Decisions
- Introduced `com.bookstore.orders.api` and exported it via a **Named Interface** declared in `package-info.java`.
- Kept `OrderValidator` in `orders.internal` and **package-private**; it implements the API interface.
- `inventory` depends only on `orders.api.OrderValidation`.

## Why this is correct
- Spring Modulith enforces: no cycles and **access only via API** (no dependencies into `internal`).  
- **Named Interfaces** let a module selectively publish packages as part of its official API.

> References:  
> - Verification rules: Spring Modulith docs (Verification)  
> - Fundamentals & module structure: Spring Modulith docs (Fundamentals)  
> - Named Interfaces: Spring Modulith docs / guides

## Run
```bash
./mvnw clean test
