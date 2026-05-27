class Magatzem {
    Article[] articles;

    public Magatzem(Article[] articles) {
        this.articles = articles;
    }

    public void actualitzarEstat() {
        for (int i = 0; i < articles.length; i++) {
            if (!articles[i].nombre.equals("Formatge Gidurat")
                    && !articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                if (articles[i].qualidad > 0) {
                    if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                        articles[i].qualidad = articles[i].qualidad - 1;
                    }
                }
            } else {
                if (articles[i].qualidad < 50) {
                    articles[i].qualidad = articles[i].qualidad + 1;

                    if (articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                        if (articles[i].diesPerVendre < 11) {
                            if (articles[i].qualidad < 50) {
                                articles[i].qualidad = articles[i].qualidad + 1;
                            }
                        }

                        if (articles[i].diesPerVendre < 6) {
                            if (articles[i].qualidad < 50) {
                                articles[i].qualidad = articles[i].qualidad + 1;
                            }
                        }
                    }
                }
            }

            if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                articles[i].diesPerVendre = articles[i].diesPerVendre - 1;
            }

            if (articles[i].diesPerVendre < 0) {
                if (!articles[i].nombre.equals("Formatge Gidurat")) {
                    if (!articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                        if (articles[i].qualidad > 0) {
                            if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                                articles[i].qualidad = articles[i].qualidad - 1;
                            }
                        }
                    } else {
                        articles[i].qualidad = articles[i].qualidad - articles[i].qualidad;
                    }
                } else {
                    if (articles[i].qualidad < 50) {
                        articles[i].qualidad = articles[i].qualidad + 1;
                    }
                }
            }
        }
    }
}
