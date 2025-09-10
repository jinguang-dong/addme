package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lat {
    public final Object a;
    public final Object b;
    public final Object c;

    public lat(Context context, qoz qozVar, uem uemVar) {
        this.b = context;
        this.c = qozVar;
        this.a = uemVar;
    }

    private static final String C(peo peoVar, Set set) {
        if (peoVar != null) {
            String str = peoVar.d().a;
            if (set.contains(str)) {
                return str;
            }
        }
        return null;
    }

    private static final Uri D(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final rcg E(Uri uri) throws rcw {
        sbp sbpVarG = G(uri);
        rcf rcfVar = new rcf();
        rcfVar.a = this;
        rcfVar.b = F(uri.getScheme());
        rcfVar.d = this.a;
        rcfVar.c = sbpVarG;
        rcfVar.e = uri;
        if (!sbpVarG.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strC = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = sbpVarG.listIterator(sbpVarG.size());
                while (listIterator.hasPrevious()) {
                    strC = ((rdx) listIterator.previous()).c();
                }
                arrayList.set(arrayList.size() - 1, strC);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        rcfVar.f = uri;
        return new rcg(rcfVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final rds F(String str) throws rcw {
        rds rdsVar = (rds) this.b.get(str);
        if (rdsVar != null) {
            return rdsVar;
        }
        throw new rcw(String.format("Requested backend isn't registered: %s", str));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    private final sbp G(Uri uri) throws rcw {
        int i = sbp.d;
        sbk sbkVar = new sbk();
        Pattern pattern = rdc.a;
        sbk sbkVar2 = new sbk();
        String encodedFragment = uri.getEncodedFragment();
        sbp sbpVarI = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? sex.a : sbp.i(rwr.c("+").a().d(encodedFragment.substring(10)));
        int size = sbpVarI.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) sbpVarI.get(i2);
            Matcher matcher = rdc.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            sbkVar2.h(matcher.group(1));
        }
        sbp sbpVarG = sbkVar2.g();
        int i3 = ((sex) sbpVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) sbpVarG.get(i4);
            rdx rdxVar = (rdx) this.c.get(str2);
            if (rdxVar == null) {
                throw new rcw("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            sbkVar.h(rdxVar);
        }
        return sbkVar.g().fB();
    }

    public static final scn i(int i, int i2) {
        scl sclVar = new scl();
        for (int i3 = 0; i3 < i; i3++) {
            sclVar.d(Integer.valueOf(i3 * i2));
        }
        return sclVar.g();
    }

    public static final sbp j(Range range, int i) {
        int i2 = sbp.d;
        sbk sbkVar = new sbk();
        float fFloatValue = ((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue();
        for (int i3 = 0; i3 < i; i3++) {
            float fFloatValue2 = ((Float) range.getLower()).floatValue() + ((fFloatValue / (i - 1)) * i3);
            if (fFloatValue2 < 1.0f) {
                sbkVar.h(String.format(Locale.getDefault(), "%.1f", Float.valueOf(fFloatValue2)).substring(1));
            } else {
                sbkVar.h(String.format(Locale.getDefault(), "%.0f", Float.valueOf(fFloatValue2)));
            }
        }
        return sbkVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc A[Catch: all -> 0x0246, TryCatch #1 {all -> 0x0246, blocks: (B:5:0x0008, B:6:0x0027, B:8:0x002e, B:9:0x003a, B:11:0x0040, B:13:0x0050, B:14:0x0057, B:15:0x005f, B:16:0x0072, B:17:0x0076, B:19:0x007c, B:21:0x0088, B:22:0x0096, B:24:0x009c, B:26:0x00a8, B:58:0x0149, B:60:0x0150, B:62:0x015c, B:63:0x015f, B:44:0x00fc, B:30:0x00c2, B:34:0x00cf, B:36:0x00db, B:38:0x00e1, B:40:0x00ed, B:41:0x00f1, B:45:0x0106, B:46:0x0110, B:48:0x0116, B:50:0x0122, B:52:0x0128, B:57:0x0141, B:55:0x0138, B:65:0x0165, B:67:0x0170, B:69:0x0177, B:71:0x019b, B:72:0x01a7, B:74:0x01ad, B:75:0x01bb, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:81:0x01db, B:85:0x01e9, B:86:0x01ed, B:87:0x01f8, B:89:0x01fe, B:91:0x020c, B:93:0x0210, B:95:0x0227, B:94:0x021e, B:96:0x022a, B:97:0x022e, B:98:0x023d), top: B:113:0x0008, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.Set A(java.util.Set r20, java.util.Set r21) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lat.A(java.util.Set, java.util.Set):java.util.Set");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void B(ojl ojlVar, boolean z, boolean z2, pdo pdoVar, boolean z3, poe poeVar, boolean z4, boolean z5) {
        pff pffVar;
        ?? r0 = this.b;
        synchronized (r0) {
            pffVar = r0.isEmpty() ? new pff(this) : (pff) r0.remove(r0.size() - 1);
        }
        pffVar.h = ojlVar;
        pffVar.a = z;
        pffVar.b = z2;
        pffVar.c = pdoVar;
        pffVar.d = z3;
        pffVar.e = poeVar;
        pffVar.f = z4;
        pffVar.g = z5;
        Executor executorDX = ojlVar.dX();
        Executor executor = executorDX;
        if (executorDX == null) {
            executor = this.a;
        }
        executor.execute(pffVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final lau a(pdk pdkVar) {
        return new lau(pdkVar, this.c, 1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, peo] */
    public final String b(poe poeVar) {
        String strB = poeVar.b();
        Set setKeySet = poeVar.g().keySet();
        if (setKeySet.size() == 1) {
            return (String) ujp.aS(setKeySet);
        }
        if (setKeySet.size() > 1) {
            String strC = C(this.a, setKeySet);
            if (strC == null) {
                strC = C(this.b, setKeySet);
            }
            if (strC != null) {
                return strC;
            }
        }
        return strB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final lau c(pdk pdkVar, int i) {
        return new lau(pdkVar, this.c, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uem] */
    public final kzi d(pdv pdvVar, int i, owf owfVar) {
        pfu pfuVar = (pfu) this.a.a();
        pfuVar.getClass();
        our ourVar = (our) this.c.a();
        ourVar.getClass();
        Executor executor = (Executor) this.b.a();
        executor.getClass();
        owfVar.getClass();
        return new kzi(pfuVar, ourVar, executor, pdvVar, i, owfVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, uem] */
    public final kmz e(Set set, kmz kmzVar) {
        if (!((rwc) this.b).h()) {
            hkk hkkVarB = ((kys) this.a).a();
            let letVar = (let) hkkVarB.e.a();
            letVar.getClass();
            Object obj = hkkVarB.a;
            ?? r0 = hkkVarB.b;
            kyu kyuVarB = ((kyv) obj).a();
            pbn pbnVar = (pbn) r0.a();
            pbnVar.getClass();
            kwr kwrVar = (kwr) hkkVarB.c.a();
            kwrVar.getClass();
            rwc rwcVar = (rwc) hkkVarB.d.a();
            rwcVar.getClass();
            set.getClass();
            return new kyr(letVar, kyuVarB, pbnVar, kwrVar, rwcVar, set, kmzVar);
        }
        pgx pgxVarB = ((kyg) this.c).a();
        set.getClass();
        rwc rwcVar2 = (rwc) pgxVarB.f.a();
        rwcVar2.getClass();
        hzs hzsVar = (hzs) pgxVarB.c.a();
        hzsVar.getClass();
        hzj hzjVar = (hzj) pgxVarB.e.a();
        hzjVar.getClass();
        Object obj2 = pgxVarB.b;
        Object obj3 = pgxVarB.g;
        ?? r6 = pgxVarB.a;
        kyu kyuVarB2 = ((kyv) obj2).a();
        hxv hxvVarB = ((hxw) obj3).a();
        lat latVar = (lat) r6.a();
        latVar.getClass();
        kzn kznVar = (kzn) pgxVarB.d.a();
        kznVar.getClass();
        pbn pbnVar2 = (pbn) pgxVarB.h.a();
        pbnVar2.getClass();
        return new kyf(set, kmzVar, rwcVar2, hzsVar, hzjVar, kyuVarB2, hxvVarB, latVar, kznVar, pbnVar2);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, uem] */
    public final kxb f(owf owfVar, Map map, long j, int i, rww rwwVar) {
        qqq qqqVarB = ((kxd) this.a).a();
        uh uhVarB = ((kxh) this.c).a();
        our ourVar = (our) this.b.a();
        ourVar.getClass();
        owfVar.getClass();
        map.getClass();
        rwwVar.getClass();
        return new kxb(qqqVarB, uhVarB, ourVar, owfVar, map, j, i, rwwVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new kee(this, sensorEventListener, 19, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new lor(this, sensorEventListener, 3, (char[]) null));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rds] */
    public final long k(Uri uri) throws rcw {
        rcg rcgVarE = E(uri);
        return rcgVarE.b.o((Uri) rcgVarE.f);
    }

    public final Iterable l(Uri uri) throws rcw {
        rds rdsVarF = F(uri.getScheme());
        sbp sbpVarG = G(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = rdsVarF.q(D(uri)).iterator();
        while (it.hasNext()) {
            Uri uriBuild = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!sbpVarG.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(uriBuild.getPathSegments());
                if (!arrayList2.isEmpty() && !uriBuild.getPath().endsWith("/")) {
                    String strB = (String) ujp.aQ(arrayList2);
                    Iterator it2 = sbpVarG.iterator();
                    while (it2.hasNext()) {
                        strB = ((rdx) it2.next()).b();
                    }
                    arrayList2.set(arrayList2.size() - 1, strB);
                    uriBuild = uriBuild.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(uriBuild);
        }
        return arrayList;
    }

    public final Object m(Uri uri, rch rchVar) {
        return rchVar.a(E(uri));
    }

    public final void n(Uri uri) {
        F(uri.getScheme()).h(D(uri));
    }

    public final void o(Uri uri) {
        F(uri.getScheme()).i(D(uri));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rds] */
    public final void p(Uri uri) throws rcw {
        rcg rcgVarE = E(uri);
        rcgVarE.b.j((Uri) rcgVarE.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rds] */
    public final void q(Uri uri, Uri uri2) throws rcw {
        rcg rcgVarE = E(uri);
        ?? r0 = rcgVarE.b;
        rcg rcgVarE2 = E(uri2);
        if (r0 != rcgVarE2.b) {
            throw new rcw("Cannot rename file across backends");
        }
        r0.k((Uri) rcgVarE.f, (Uri) rcgVarE2.f);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rds] */
    public final boolean r(Uri uri) throws rcw {
        rcg rcgVarE = E(uri);
        return rcgVarE.b.g((Uri) rcgVarE.f);
    }

    public final boolean s(Uri uri) {
        return F(uri.getScheme()).l(D(uri));
    }

    @Deprecated
    public final void t(Uri uri) throws rcw {
        if (r(uri)) {
            if (!s(uri)) {
                p(uri);
                return;
            }
            Iterator it = l(uri).iterator();
            while (it.hasNext()) {
                t((Uri) it.next());
            }
            o(uri);
        }
    }

    public final boolean u(rww rwwVar) {
        if (((hef) this.a).b().booleanValue()) {
            return ((qoz) this.c).c.a == 2;
        }
        return qpm.d((Context) this.b, (qpn) rwwVar.fr());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    public final poy v(ppu ppuVar, String str, long j) {
        uwt uwtVar = (uwt) this.c;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) uwtVar.d.a();
        scheduledExecutorService.getClass();
        Object objA = uwtVar.a.a();
        ppj ppjVarA = ((mfx) uwtVar.c).a();
        pbn pbnVar = (pbn) uwtVar.b.a();
        pbnVar.getClass();
        ppg ppgVar = new ppg(scheduledExecutorService, (rqi) objA, ppjVarA, pbnVar);
        qqq qqqVar = (qqq) this.a;
        ?? r1 = qqqVar.d;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ppz ppzVar = (ppz) r1.a();
        ppzVar.getClass();
        ppj ppjVarA2 = ((mfx) qqqVar.e).a();
        qaq qaqVar = (qaq) qqqVar.a.a();
        qaqVar.getClass();
        fri friVar = new fri();
        pbn pbnVar2 = (pbn) qqqVar.c.a();
        pbnVar2.getClass();
        qqq qqqVar2 = (qqq) qqqVar.b.a();
        qqqVar2.getClass();
        ppuVar.getClass();
        return new poy(ppzVar, ppjVarA2, qaqVar, friVar, pbnVar2, qqqVar2, ppuVar, ppgVar, str, jElapsedRealtimeNanos, j);
    }

    public final peo w(peq peqVar) {
        sgj sgjVarListIterator = ((scn) this.b).listIterator();
        while (sgjVarListIterator.hasNext()) {
            pil pilVar = (pil) sgjVarListIterator.next();
            if (pilVar.h == peqVar) {
                return pilVar;
            }
        }
        return null;
    }

    public final paq x() {
        return ((pmg) this.a).c();
    }

    public final synchronized syu y(Set set) {
        syu syuVarI;
        boolean z;
        syu syuVarM;
        long j;
        syu syuVarM2;
        syu syuVarCh;
        our ourVar = new our();
        try {
            ourVar.d(x());
            pfb pfbVar = new pfb(this);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                pgb pgbVar = (pgb) it.next();
                for (final phx phxVar : pgbVar.a) {
                    List list = pfbVar.b;
                    if (!list.contains(phxVar)) {
                        Object obj = pfbVar.d.b;
                        pmf pmfVarJ = ((mwq) obj).J(phxVar);
                        if (pmfVarJ == null) {
                            j = 0;
                            syuVarM2 = ((pmg) phxVar.e.a).f(1L);
                        } else {
                            j = 0;
                            syuVarM2 = null;
                        }
                        long j2 = phxVar.c;
                        rnt.s(j2 > j);
                        pmf pmfVarI = ((mwq) obj).I(j2);
                        syu syuVarF = pmfVarI == null ? ((pmg) ((mwq) obj).a).f(j2) : null;
                        if (pmfVarJ == null || pmfVarI == null) {
                            if (syuVarM2 == null) {
                                pmfVarJ.getClass();
                                syuVarM2 = ske.M(pmfVarJ);
                            }
                            if (syuVarF == null) {
                                pmfVarI.getClass();
                                syuVarF = ske.M(pmfVarI);
                            }
                            syuVarCh = ojl.ch(syuVarM2, syuVarF, new pah() { // from class: pha
                                @Override // defpackage.pah
                                public final Object a(Object obj2, Object obj3) {
                                    return piq.f((pmf) obj3, (pmf) obj2, phxVar.j());
                                }
                            });
                        } else {
                            syuVarCh = ske.M(piq.f(pmfVarI, pmfVarJ, phxVar.j()));
                        }
                        pfbVar.a.add(swz.i(syuVarCh, new kve(phxVar, 14), sxo.a));
                        list.add(phxVar);
                    }
                }
                boolean z2 = true;
                for (phy phyVar : pgbVar.b) {
                    List list2 = pfbVar.b;
                    if (!list2.contains(phyVar)) {
                        long j3 = phyVar.b;
                        if (j3 > 0) {
                            Object obj2 = pfbVar.d.b;
                            rnt.s(z2);
                            pmf pmfVarI2 = ((mwq) obj2).I(j3);
                            if (pmfVarI2 == null) {
                                z = z2;
                                syuVarM = swz.i(((pmg) ((mwq) obj2).a).f(j3), new mdv(10), sxo.a);
                            } else {
                                z = z2;
                                syuVarM = ske.M(piq.f(pmfVarI2, null, z));
                            }
                            pfbVar.a.add(swz.i(syuVarM, new kve(phyVar, 15), sxo.a));
                        } else {
                            z = z2;
                            pfbVar.a.add(ske.M(phz.g(phyVar)));
                        }
                        list2.add(phyVar);
                        z2 = z;
                    }
                }
                pfbVar.c.add(pgbVar);
            }
            syuVarI = swz.i(ske.I(pfbVar.a), new kve(pfbVar, 16), sxo.a);
            ourVar.close();
        } finally {
        }
        return syuVarI;
    }

    public final synchronized Set z(Set set) {
        return A(set, sfd.a);
    }

    public lat(pmg pmgVar, mwq mwqVar, pfl pflVar) {
        this.a = pmgVar;
        this.b = mwqVar;
        this.c = pflVar;
    }

    public lat(ppj ppjVar, qqq qqqVar, uwt uwtVar) {
        this.a = qqqVar;
        this.c = uwtVar;
        this.b = ppjVar.q;
    }

    public lat(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public lat(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, byte[] bArr) {
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public lat(uem uemVar, uem uemVar2, rwc rwcVar) {
        this.a = uemVar;
        this.c = uemVar2;
        this.b = rwcVar;
    }

    public lat(Handler handler, pbn pbnVar) {
        this.a = new oup(handler);
        this.c = pbnVar;
        this.b = new ArrayList();
    }

    public lat(hbj hbjVar) {
        this.a = Range.create((Float) hbjVar.e(hal.l).get(), (Float) hbjVar.e(hal.m).get());
        this.c = Range.create((Float) hbjVar.e(hal.n).get(), (Float) hbjVar.e(hal.o).get());
        this.b = Range.create((Float) hbjVar.e(hal.p).get(), (Float) hbjVar.e(hal.q).get());
    }

    public lat(toj tojVar, String str, String str2) {
        this.a = smb.f;
        this.b = rnt.y(new quy(this, tojVar, 2));
        this.c = rnt.y(new qyj(this, str, str2, 0));
    }

    public lat(uem uemVar, uem uemVar2, uem uemVar3) {
        this.a = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        uemVar3.getClass();
        this.b = uemVar3;
    }

    public lat(uem uemVar, uem uemVar2, uem uemVar3, byte[] bArr) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        uemVar3.getClass();
        this.b = uemVar3;
    }

    public lat(Set set, Set set2, Set set3) {
        this.b = scn.F(set);
        this.a = scn.F(set2);
        this.c = scn.F(set3);
    }

    public lat(Map map) {
        this.c = map;
        this.a = (peo) map.get(lcz.RAW_WIDE);
        this.b = (peo) map.get(lcz.RAW_WIDE_RM);
    }

    public lat(uhf uhfVar, rau rauVar, qqe qqeVar) {
        uhfVar.getClass();
        rauVar.getClass();
        qqeVar.getClass();
        this.c = uhfVar;
        this.a = rauVar;
        this.b = qqeVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public lat(List list, List list2, List list3) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rds rdsVar = (rds) it.next();
            if (TextUtils.isEmpty(rdsVar.f())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                rds rdsVar2 = (rds) this.b.put(rdsVar.f(), rdsVar);
                if (rdsVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + rdsVar2.getClass().getCanonicalName() + " with " + rdsVar.getClass().getCanonicalName());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            rdx rdxVar = (rdx) it2.next();
            if (TextUtils.isEmpty(rdxVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                rdx rdxVar2 = (rdx) this.c.put(rdxVar.a(), rdxVar);
                if (rdxVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + rdxVar2.getClass().getCanonicalName() + " with " + rdxVar.getClass().getCanonicalName());
                }
            }
        }
        this.a.addAll(list3);
    }

    public lat(SensorManager sensorManager, Executor executor) {
        Sensor next;
        this.a = sensorManager;
        this.c = executor;
        Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ("com.google.sensor.double_twist".equals(next.getStringType()) && "Google".equals(next.getVendor())) {
                break;
            }
        }
        this.b = next;
    }
}
