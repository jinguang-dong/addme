package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.wear.ambient.AmbientModeSupport;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxr implements pxf {
    public final Executor a;
    public final qas b;
    public final qaq c;
    private final nzv d;
    private final rwc e;
    private final rwc f;
    private final lat g;
    private final AmbientModeSupport.AmbientController h;

    public pxr(nzv nzvVar, lat latVar, Executor executor, AmbientModeSupport.AmbientController ambientController, qas qasVar, qaq qaqVar, rwc rwcVar, rwc rwcVar2) {
        this.d = nzvVar;
        this.g = latVar;
        this.a = executor;
        this.h = ambientController;
        this.b = qasVar;
        this.c = qaqVar;
        this.e = rwcVar;
        this.f = rwcVar2;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.pxf
    public final syu a(pxe pxeVar) throws pul {
        URI uri;
        nzh nzhVar;
        rdf rdfVar;
        final syn synVarE;
        sci sbqVar;
        Uri uri2 = pxeVar.a;
        uri2.getLastPathSegment();
        try {
            try {
                rdf rdfVar2 = (rdf) this.g.m(uri2, new rdg(this.b, sxo.a));
                URI uriCreate = URI.create(pxeVar.b);
                nzk nzkVar = new nzk();
                int i = 0;
                nzkVar.b(0);
                rdfVar2.getClass();
                nzkVar.h = rdfVar2;
                uriCreate.getClass();
                nzkVar.a = uriCreate;
                nzh nzhVar2 = nzh.b;
                nzkVar.a(nzhVar2);
                rwc rwcVar = this.e;
                if (rwcVar.h()) {
                    nzkVar.f = (nzb) ((rww) rwcVar.c()).fr();
                }
                nzkVar.i = this.h;
                if (pxc.c == pxeVar.c) {
                    nzkVar.a(nzhVar2);
                } else {
                    nzf nzfVarA = nzh.a();
                    nzfVarA.b(nzg.WIFI);
                    nzfVarA.b(nzg.ETHERNET);
                    nzfVarA.b(nzg.BLUETOOTH);
                    nzfVarA.c(true);
                    nzkVar.a(nzfVarA.a());
                }
                int i2 = pxeVar.d;
                if (i2 > 0) {
                    nzkVar.b(i2);
                } else {
                    rwc rwcVar2 = this.f;
                    if (rwcVar2.h() && ((Integer) rwcVar2.c()).intValue() > 0) {
                        nzkVar.b(((Integer) rwcVar2.c()).intValue());
                    }
                }
                sbp sbpVar = pxeVar.e;
                for (int i3 = 0; i3 < ((sex) sbpVar).c; i3++) {
                    Pair pair = (Pair) sbpVar.get(i3);
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    if (nzkVar.b == null) {
                        nzkVar.b = new scf();
                    }
                    scf scfVar = nzkVar.b;
                    ujp.bo(str, str2);
                    sbd sbdVarE = (sbd) scfVar.a().get(str);
                    if (sbdVarE == null) {
                        sbdVarE = sbp.e(4);
                        scfVar.a().put(str, sbdVarE);
                    }
                    sbdVarE.d(str2);
                }
                scf scfVar2 = nzkVar.b;
                if (scfVar2 != null) {
                    ?? r0 = scfVar2.a;
                    if (r0 == 0) {
                        sbqVar = rzz.a;
                    } else {
                        Set<Map.Entry> setEntrySet = r0.entrySet();
                        if (setEntrySet.isEmpty()) {
                            sbqVar = rzz.a;
                        } else {
                            sbr sbrVar = new sbr(setEntrySet.size());
                            for (Map.Entry entry : setEntrySet) {
                                Object key = entry.getKey();
                                sbp sbpVarG = ((sbk) entry.getValue()).g();
                                sbrVar.f(key, sbpVarG);
                                i += ((sex) sbpVarG).c;
                            }
                            sbqVar = new sbq(sbrVar.b(), i);
                        }
                    }
                    nzkVar.c = sbqVar;
                } else if (nzkVar.c == null) {
                    nzkVar.c = rzz.a;
                }
                if (nzkVar.g != 1 || (uri = nzkVar.a) == null || (nzhVar = nzkVar.d) == null || (rdfVar = nzkVar.h) == null) {
                    throw new IllegalStateException();
                }
                nzl nzlVar = new nzl(uri, nzkVar.c, nzhVar, nzkVar.i, rdfVar, nzkVar.e, nzkVar.f);
                final nzv nzvVar = this.d;
                synchronized (nzvVar.f) {
                    synVarE = nzvVar.e(nzlVar, 1);
                    synVarE.c(new ntd(nzvVar, 14), nzvVar.a);
                    nzvVar.d.add(synVarE);
                    synVarE.c(new Runnable() { // from class: nzr
                        @Override // java.lang.Runnable
                        public final void run() {
                            syn synVar = synVarE;
                            nzv nzvVar2 = nzvVar;
                            synchronized (nzvVar2.f) {
                                nzvVar2.d.remove(synVar);
                            }
                        }
                    }, sxo.a);
                }
                nzvVar.b();
                int i4 = qbu.a;
                qdp qdpVarE = qdp.e(synVarE);
                jmx jmxVar = new jmx(this, 13);
                Executor executor = this.a;
                return qdpVarE.d(Exception.class, jmxVar, executor).g(new kjl(this, pxeVar, 13, null), executor);
            } catch (IOException e) {
                if (!(e instanceof rcu) && !(e.getCause() instanceof IllegalArgumentException)) {
                    qbu.g(e, "%s: Unable to create DownloadDestination for file %s", "Offroad2FileDownloader", uri2);
                    tfm tfmVarA = pul.a();
                    tfmVarA.b = puk.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                    tfmVarA.d = e;
                    throw tfmVarA.c();
                }
                qbu.d("%s: The file uri is invalid, uri = %s", "Offroad2FileDownloader", uri2);
                tfm tfmVarA2 = pul.a();
                tfmVarA2.b = puk.MALFORMED_FILE_URI_ERROR;
                tfmVarA2.d = e;
                throw tfmVarA2.c();
            }
        } catch (pul e2) {
            return ske.L(e2);
        }
    }
}
