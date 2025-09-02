Java kordamine

1.  Kirjutage lõpuni klass mapper.PersonMapper, mis teisendab stringi
    kujul olevad andmed objektiks ja vastupidi.

    Person parse(String input) - teisendab stringi objektiks. String
    stringify(Person person) - teisendab objekti stringiks.

    Olulise info stringist kättesaamiseks võite kasutada
    regulaaravaldisi (kui oskate) või näiteks meetodeid:

    -   replace() - eemaldamaks mittevajalikke sümboleid (asendate
        midagi tühja stringiga)
    -   trim() - eemaldab tühikud, tabulaatorid ja reavahetused stringi
        algusest ja lõpust.
    -   split() - stringi osadeks jagamine mingi stringi kohalt.

    Proovimiseks on klass mapper.Main.

    proovige järgmisi sisendeid: { "firstName": "Alice" } ja
    {"id":null,"firstName":"Alice","lastName":"Smith","age":20}

    Stringist info leidmise lahendus võiks olla üldine ja peaks hakkama
    saama mistahes hulga mistahes võtmetega (mitte ainult "firstName",
    "lastName" ja "age").

    Võiks kasutada abifunktsiooni, mis teeb Map-i sisendist leitud
    võti-väärtus paaridest.

2.  Selle ülesande mõte andmetüüpidele tähelepanu juhtimises.

    Teil on kasutada klass storage.Storage, millel on meetodid store()
    ja get(). Meetod store() võimaldab mingi võtme alla salvestada
    mistahes väärtusi (nagu Map). Meetod get() võimaldab võtme järgi
    väärtuse välja küsida.

    Klass storage.Storage illustreerib näidet, kui tahame kasutada mõne
    raamistiku funktsionaalsust, mis ei tea meie koodis olevatest
    tüüpidest midagi. Antud näide on kunstlik aga reaalse näitega
    puutume kokku hiljem.

    Kasutage storage.Storage, et salvestada kaks erinevat objekti ja
    need pärast välja küsida ja muutujasse salvestada.

    Klassis storage.Main on sellega alustatud.

3.  a)  Kasutades Java refleksiooni trükkige välja kõik klassi
        common.Person väljad.

        Näide on klassis reflection.samples.ReadFields.

    b)  Looge uus common.Person tüüpi objekt ja väärtustage refleksiooni
        abil kõik string tüüpi väljad mingi väärtusega.

        Väljale kirjutamise näide on klassis
        reflection.samples.WriteToField.

        String tüüpi väljad leiate nii:
        field.getType().equals(String.class).

    c)  Väärtustage vaid need väljad, mis on tähistatud annotatsiooniga
        @FillThisField.

        Seda, millised väljad on märgistatud saate teada nii:
        field.getAnnotation(FillThisField.class) Kui väli ei ole vastava
        annotatsiooniga märgistatud, siis tagastatakse null.

4.  (Valikuline) Muutke esimese ülesande koodi nii, et parser oskaks
    lugeda stringist väärtusi mistahes objektile (mitte ainult Person).

    Kui kasutate refleksiooni, ei pea te väljade nimesid koodi sisse
    kirjutama. Saate küsida, mis väljad klassil on ja otsida nendele
    vastavad väärtused.

    Parseri kasutamine käiks näiteks nii:

    Person person = new Parser().parse("... sisend json ...",
    Person.class);

    Order order = new Parser().parse("... sisend json ...", Order.class);

5.  (Valikuline) Kirjutage parser, mis võimaldab lugeda alloleva
    grammatikaga sisendit.

    list → '\[' elements '\]' elements → element (',' element)\* element
    → number \| list

    Sellele grammatikale vastab näiteks sisend "\[1, 256, \[3, \[1, 3\],
    \[2, 5\], 2\]\]".

    Tööga on alustatud paketis parser.

Seletused ja lahendused: https://youtu.be/MLh3stVdYC4
