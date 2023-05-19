Feature: Flight Booking
Scenario: Flight Booking on cheapair
Given Launch the application URL
When Enter the flight details
And click on the search flight
Then Search results should be displayed
And select the departure and return flight with least fare
And Enter the passenger details
| firstname    | Lastname | Gender   | BOB Month     | Date | Year |
| Saravanan    | M        | Male     | January       | 01   | 2000 |
| Suresh       | M        | Male     | February      | 02   | 2001 |
| Mathan       | R        | Male     | August        | 15   | 1947 |
| Amaravathi   | M        | Female   | January       | 26   | 1950 |
| Charumathi   | K        | Female   | September     | 05   | 2010 |
| Nanjil       | K        | Male     | June          | 29   | 2002 |

And Enter the card details
| ccno             | Exp Month    | Year |cvv  | cardHolderName | Country |billingadd             | city       | phoneno    |
| 9874563214789632 | 01 - January | 2023 | 123 | Saravanan      | India   | 12B,7G Rainbow Colony | Coimbatore | 7896541230 |