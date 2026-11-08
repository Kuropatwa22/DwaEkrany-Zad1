Zadanie 1 — Dwa ekrany

Zrobiłem aplikację do zapisywania się na kurs.

Aplikacja ma dwa ekrany. Na pierwszym wpisuje się dane, a na drugim można je sprawdzić i potwierdzić.

Do przechodzenia między ekranami użyłem Intent, a do przekazywania danych putExtra.

Po potwierdzeniu aplikacja wraca do formularza i pokazuje numer zgłoszenia.

Dodałem też możliwość udostępnienia podsumowania przez inną aplikację.

1. Dlaczego rejestracja wyniku jest polem klasy, a nie w obsłudze kliknięcia przycisku?

Ponieważ ActivityResultLauncher musi być zarejestrowany przed uruchomieniem ekranu.

Gdyby rejestrować go dopiero po kliknięciu przycisku, aplikacja mogłaby zgłosić błąd.

Dlatego umieściłem go jako pole klasy.

2. Co się dzieje po naciśnięciu Wstecz na drugim ekranie?

Po naciśnięciu Wstecz wracamy do pierwszego ekranu.

Formularz pozostaje wypełniony i można dalej poprawiać dane.

Nie pokazuje się numer zgłoszenia, ponieważ użytkownik nie potwierdził zapisu.
