What I Added
I added the coffeePreference field to the Employee model because coffee is a big part of office culture, and I wanted to personalize employee data with their favorite coffee type.

Why It’s Cool or Useful
It adds a fun and personal touch to employee records.

It allows filtering employees by coffee preference, making it easy to find colleagues who enjoy the same type of coffee.

It integrates with a FeignClient to find nearby cafés based on an employee’s city, helping employees locate their favorite coffee spots.

How It Works
New Field in Employee Model:

coffeePreference is added as a string field in the Employee class.

New API Endpoint to Filter by Coffee Type:

GET /employees/by-coffee/{coffeeType} returns employees who prefer a specific coffee.

Integration with FeignClient:

GET /employees/{id}/cafes fetches an employee’s city and uses the AddressClient FeignClient to retrieve nearby cafés.
