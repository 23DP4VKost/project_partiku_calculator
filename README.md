# Makro kalkulatora lietojumprogramma

## Ievads

**Makro kalkulatora lietojumprogramma** ir konsoles programma, kas izstrādāta, lai palīdzētu lietotājiem izsekot pārtikas makroelementiem un kalorijām. Tā ļauj lietotājiem pievienot pārtikas produktus, skatīt un pārvaldīt pārtikas bibliotēku, kārtot pārtikas produktus, pamatojoties uz uzturvērtībām, un saglabāt pārtikas bibliotēku teksta failā. Lietojumprogramma ir lietotājam draudzīga un nodrošina skaidru saskarni pārtikas datu efektīvai pārvaldībai.

### Galvenās funkcijas:
- Pievienot jaunus pārtikas produktus ar uzturvērtības informāciju.
- Skatīt, rediģēt un dzēst pārtikas produktus bibliotēkā.
- Kārtot pārtikas produktus pēc nosaukuma, olbaltumvielām, taukiem, ogļhidrātiem vai kalorijām.
- Saglabāt pārtikas bibliotēku `.txt` failā turpmākai izmantošanai.

---

## Lietotāja saskarne

Lietojumprogramma darbojas konsolē un izmanto izvēlnes vadītu saskarni. Tā sniedz skaidras instrukcijas un opcijas lietotājiem mijiedarbībai ar programmu. Saskarne ir uzlabota ar krāsu kodētu tekstu labākai lasāmībai.

### Galvenā izvēlne:
- **1. iespēja:** Pievienot jaunu pārtikas produktu.
 - **2. iespēja:** Piekļūstiet pārtikas bibliotēkai (skatīt, rediģēt, dzēst vai kārtot vienumus).
- **3. iespēja:** Saglabājiet pārtikas bibliotēku teksta failā.

### Pārtikas bibliotēkas izvēlne:
- **1. iespēja:** Skatīt pārtikas bibliotēku.
- **2. iespēja:** Rediģēt pārtikas produktu.
- **3. iespēja:** Dzēst pārtikas produktu.

---

## Funkciju apraksti

### 1. Jauna pārtikas produkta pievienošana
1. Galvenajā izvēlnē atlasiet **1. iespēju**.
2. Ievadiet pārtikas produkta nosaukumu un norādiet uzturvērtības (olbaltumvielas, tauki, ogļhidrāti uz 100 g) un patērēto daudzumu (gramos).
3. Programma aprēķina kopējās uzturvērtības un pievieno pārtikas produktu bibliotēkai.
4. Tiek parādīts apstiprinājuma ziņojums ar aprēķināto uzturvērtības informāciju.

### 2. Pārtikas bibliotēkas skatīšana
1. Galvenajā izvēlnē atlasiet **2. iespēju** un pēc tam pārtikas bibliotēkas izvēlnē izvēlieties **1. iespēju**.
2. Programma tabulas formātā parāda visus pārtikas produktus, norādot to nosaukumu, daudzumu un kopējo uzturvērtību.
3. Pēc apskates programma vaicā, vai kārtot bibliotēku:
- Ievadiet “yes”, lai kārtotu bibliotēku pēc nosaukuma, olbaltumvielām, taukiem, ogļhidrātiem vai kalorijām.
- Ievadiet “no”, lai atgrieztos izvēlnē.

### 3. Pārtikas produkta rediģēšana
1. Galvenajā izvēlnē atlasiet **2. iespēju** un pēc tam pārtikas bibliotēkas izvēlnē izvēlieties **2. iespēju**.
2. Ievadiet rediģējamā pārtikas produkta ID.
3. Norādiet atjaunināto informāciju (nosaukumu, uzturvērtību un daudzumu).
4. Programma atjaunina pārtikas produktu un parāda apstiprinājuma ziņojumu.

### 4. Pārtikas produkta dzēšana
1. Galvenajā izvēlnē atlasiet **2. iespēju**, pēc tam pārtikas bibliotēkas izvēlnē izvēlieties **3. iespēju**.
2. Ievadiet dzēšamā pārtikas produkta ID.
3. Programma noņem vienumu no bibliotēkas un parāda apstiprinājuma ziņojumu.

### 5. Pārtikas bibliotēkas kārtošana
1. Kārtošanu var veikt pēc bibliotēkas apskates vai atlasot kārtošanas opciju.
2. Ievadiet kārtošanas kritērijus (`nosaukums`, `olbaltumvielas`, `tauki`, `ogļhidrāti` vai `kcal`).
3. Programma sakārto bibliotēku un parāda sakārtoto sarakstu.

### 6. Pārtikas bibliotēkas saglabāšana
1. Galvenajā izvēlnē atlasiet **3. iespēju**.
2. Ievadiet vēlamo faila nosaukumu.
3. Programma saglabā bibliotēku `.txt` failā formatētā tabulas struktūrā.
4. Pēc veiksmīgas saglabāšanas tiek parādīts apstiprinājuma ziņojums.

---

## Piezīmes
- Pārliecinieties, vai visi ievades dati ir derīgi (piemēram, uzturvērtības dati ir nenegatīvi).
- Programma sniedz kļūdu ziņojumus par nederīgām ievades datiem vai darbībām.
