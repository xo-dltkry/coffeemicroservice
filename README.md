# Unique Feature: Coffee Preference Filter

## What I added
I added a `coffeePreference` field to the Employee model because I love coffee and wanted a fun way to categorize employees.

## Why it’s cool or useful
This feature allows us to filter employees based on their favorite coffee type, making it easy to find colleagues who share the same taste.

## How it works
- The `Employee` model has a new field: `coffeePreference` (String).
- A new endpoint `/employees/by-coffee/{coffeeType}` allows filtering employees by their coffee preference.
- This makes it easy to organize coffee meetups or suggest nearby cafes based on preferences.
