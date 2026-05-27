class Magatzem {
    Article[] articles;

    public Magatzem(Article[] articles) {
        this.articles = articles;
    }

    public void actualitzarEstat() {
        for (int i = 0; i < articles.length; i++) {
            if (!articles[i].nombre.equals("Formatge Gidurat")
                    && !articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                if (articles[i].calidad > 0) {
                    if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                        articles[i].calidad = articles[i].calidad - 1;
                    }
                }
            } else {
                if (articles[i].calidad < 50) {
                    articles[i].calidad = articles[i].calidad + 1;

                    if (articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                        if (articles[i].diasParaVender < 11) {
                            if (articles[i].calidad < 50) {
                                articles[i].calidad = articles[i].calidad + 1;
                            }
                        }

                        if (articles[i].diasParaVender < 6) {
                            if (articles[i].calidad < 50) {
                                articles[i].calidad = articles[i].calidad + 1;
                            }
                        }
                    }
                }
            }

            if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                articles[i].diasParaVender = articles[i].diasParaVender - 1;
            }

            if (articles[i].diasParaVender < 0) {
                if (!articles[i].nombre.equals("Formatge Gidurat")) {
                    if (!articles[i].nombre.equals("Entrades per al Concert del Trobador")) {
                        if (articles[i].calidad > 0) {
                            if (!articles[i].nombre.equals("Martell de Thor (Llegendari)")) {
                                articles[i].calidad = articles[i].calidad - 1;
                            }
                        }
                    } else {
                        articles[i].calidad = articles[i].calidad - articles[i].calidad;
                    }
                } else {
                    if (articles[i].calidad < 50) {
                        articles[i].calidad = articles[i].calidad + 1;
                    }
                }
            }
        }
    }
}
