package defpackage;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.chromium.net.ExperimentalUrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzo {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+|\\*)");
    public static final SimpleDateFormat b;
    public static final Object c;
    public final nzl d;
    public final Executor e;
    public final syv f = new syv(new ire(5));
    public final smk g = new smk();
    public final AtomicInteger h = new AtomicInteger(0);
    public final nzy i;
    private final oaa j;

    static {
        Object obj = new Object();
        c = obj;
        synchronized (obj) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            b = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }
    }

    public nzo(nzy nzyVar, nzl nzlVar, oaa oaaVar, Executor executor) {
        this.i = nzyVar;
        this.d = nzlVar;
        this.j = oaaVar;
        this.e = executor;
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new nzi(String.format(str, objArr));
        }
    }

    public static long c(nzd nzdVar) throws nzi {
        Date date;
        List list = (List) nzdVar.b().get("Last-Modified");
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        String str = (String) list.get(0);
        try {
            synchronized (c) {
                date = b.parse(str);
            }
            if (date != null) {
                return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
            }
            throw new nzi(mn.g(str, "Invalid Last-Modified header: "));
        } catch (ParseException e) {
            throw new nzi("Invalid Last-Modified header: ".concat(String.valueOf(str)), e);
        }
    }

    public final syn b(final URI uri) {
        obu obuVarB = this.j.b(uri.toString());
        nzl nzlVar = this.d;
        sgj sgjVarListIterator = nzlVar.b.a().listIterator();
        while (sgjVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
            obuVarB.g((String) entry.getKey(), (String) entry.getValue());
        }
        int i = nzlVar.d;
        if (i != 0) {
            ((ExperimentalUrlRequest.Builder) obuVarB.a).setTrafficStatsTag(i);
        }
        syu syuVarB = nzlVar.f.b();
        nzm nzmVar = new nzm(this, uri, obuVarB, 1, (short[]) null);
        Executor executor = this.e;
        syn synVarV = syn.v(swz.j(syuVarB, nzmVar, executor));
        int i2 = 2;
        kjl kjlVar = new kjl(this, obuVarB, i2, null);
        sxo sxoVar = sxo.a;
        syu syuVarJ = swz.j(swf.j(swz.i(swz.j(swz.j(synVarV, kjlVar, sxoVar), new kjl(this, uri, 3), executor), new kve(obuVarB, 8), sxoVar), IOException.class, new kjm(i2), sxoVar), new kjm(5), executor);
        syu syuVarJ2 = swz.j(syuVarJ, new jmx(this, 7), executor);
        final syn synVar = (syn) syuVarJ;
        return (syn) swz.j(syuVarJ2, new sxi() { // from class: nzn
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                nzd nzdVar = (nzd) ske.U(synVar);
                uri.toString();
                return this.a.d(nzdVar);
            }
        }, executor);
    }

    public final syu d(nzd nzdVar) {
        int iA = nzdVar.a();
        if (iA < 300 || iA >= 400) {
            return ske.M(nzdVar);
        }
        int iIncrementAndGet = this.h.incrementAndGet();
        try {
            nzdVar.close();
            if (iIncrementAndGet > 20) {
                return ske.L(new nzi("Too many redirects"));
            }
            String str = nzdVar.d;
            if (str.isEmpty()) {
                return ske.L(new nzi("Redirect response with no redirect url given"));
            }
            try {
                return b(new URI(str));
            } catch (URISyntaxException e) {
                return ske.L(new nzi("Unable to parse redirect url", e));
            }
        } catch (IOException e2) {
            return ske.L(new nzi("Unable to close response for redirect", e2));
        }
    }
}
