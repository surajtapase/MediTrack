# MediTrack – System Design

## Architecture
MediTrack follows a layered architecture:

- Entity Layer
- Service Layer
- Utility Layer
- Exception Handling
- Menu-Driven UI

## Core Entities
- Person (Base class)
- Doctor
- Patient
- Appointment
- Bill
- BillSummary

## Relationships
- Doctor and Patient inherit from Person
- Appointment connects Doctor and Patient
- Bill is generated from Appointment
- BillSummary aggregates billing data

## Design Principles Used
- Inheritance
- Encapsulation
- Interface-based design
- Separation of concerns
- Enum usage for fixed states

## Data Storage
- In-memory storage using `DataStore`
- No external database (as per requirement)
