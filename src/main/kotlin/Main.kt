package org.example
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


fun main() {
    val document: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    val quotes: Elements = document.select("article")

    for (quote in quotes) {
        println("${quote.text()}\n\t")
    }
}