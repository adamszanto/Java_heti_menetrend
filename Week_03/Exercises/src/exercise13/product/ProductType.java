package exercise13.product;

// TODO: Enumoknál kötelező megjegyezni pár metódust: valueOf() statikus metódus. ProductType.valueOf(String string) ... ha talál match-et rá akkor visszaadja azt az enum-ot.
// TODO: name(), ordinal() ami még fontos... előbbi a megnevezést (CHEAP, stb.) az ordinal() megadja hogy hanyadik helyen van a felsorolásban...
// TODO: Enumnál kötelező 3 metódus tudni tehát: valueOf(), name(), ordinal()
// TODO: +1 Extra: values(), ami tömbként visszaadja az összes enum elemet. Statikus metódus ő is.

public enum ProductType {
    CHEAP, AVERAGE, EXPENSIVE, LUXURY_ITEM, POPULAR
}
