package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oca {
    public final obz a;
    protected boolean b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public Set f;
    public String g;
    public final String h;
    public final ocg i;
    public final syu j;
    public boolean k;
    public final tqr l;
    public pro m;
    public final tpe n;

    public oca(occ occVar, tqr tqrVar) {
        tzf tzfVar;
        tpe tpeVar = (tpe) tze.a.m();
        this.n = tpeVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.k = false;
        this.a = occVar;
        this.h = occVar.h;
        this.g = occVar.e;
        oce oceVar = occVar.f.getApplicationContext() instanceof oce ? (oce) occVar.f.getApplicationContext() : (oce) ocf.a.get();
        ocg ocgVarA = oceVar != null ? oceVar.a() : null;
        if (ocgVarA == null) {
            this.i = null;
        } else {
            tzf tzfVar2 = ocgVarA.a;
            tzf tzfVar3 = tzf.CPS_APP_PROCESS_GLOBAL_PROVIDER;
            if (tzfVar2 == tzfVar3 || tzfVar2 == (tzfVar = tzf.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER)) {
                this.i = ocgVarA;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + tzfVar2.toString() + " is not one of the process-level expected values: " + String.valueOf(tzfVar3) + " or " + String.valueOf(tzfVar));
                this.i = null;
            }
        }
        this.j = oceVar != null ? oceVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        tze tzeVar = (tze) tpeVar.b;
        tzeVar.b |= 1;
        tzeVar.c = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(((tze) tpeVar.b).c));
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        tze tzeVar2 = (tze) tpeVar.b;
        tzeVar2.b |= 131072;
        tzeVar2.g = seconds;
        if (prt.f(occVar.f)) {
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            tze tzeVar3 = (tze) tpeVar.b;
            tzeVar3.b |= 8388608;
            tzeVar3.h = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            tze tzeVar4 = (tze) tpeVar.b;
            tzeVar4.b |= 2;
            tzeVar4.d = jElapsedRealtime;
        }
        this.l = tqrVar;
    }

    public final void a(ocg ocgVar) {
        tpe tpeVar = this.n;
        tzg tzgVar = ((tze) tpeVar.b).k;
        if (tzgVar == null) {
            tzgVar = tzg.a;
        }
        tpc tpcVar = (tpc) tzgVar.a(5, null);
        tpcVar.r(tzgVar);
        tzf tzfVar = ocgVar.a;
        tpe tpeVar2 = (tpe) tpcVar;
        if (!tpeVar2.b.C()) {
            tpeVar2.o();
        }
        tzg tzgVar2 = (tzg) tpeVar2.b;
        tzgVar2.d = tzfVar.l;
        tzgVar2.b |= 2;
        tud tudVar = tzgVar2.c;
        if (tudVar == null) {
            tudVar = tud.a;
        }
        tpc tpcVar2 = (tpc) tudVar.a(5, null);
        tpcVar2.r(tudVar);
        tuc tucVar = ((tud) tpcVar2.b).c;
        if (tucVar == null) {
            tucVar = tuc.a;
        }
        tpc tpcVar3 = (tpc) tucVar.a(5, null);
        tpcVar3.r(tucVar);
        if (!tpcVar3.b.C()) {
            tpcVar3.o();
        }
        tuc tucVar2 = (tuc) tpcVar3.b;
        tucVar2.b |= 1;
        tucVar2.c = 92469333;
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        tud tudVar2 = (tud) tpcVar2.b;
        tuc tucVar3 = (tuc) tpcVar3.l();
        tucVar3.getClass();
        tudVar2.c = tucVar3;
        tudVar2.b |= 1;
        if (!tpeVar2.b.C()) {
            tpeVar2.o();
        }
        tzg tzgVar3 = (tzg) tpeVar2.b;
        tud tudVar3 = (tud) tpcVar2.l();
        tudVar3.getClass();
        tzgVar3.c = tudVar3;
        tzgVar3.b |= 1;
        tzg tzgVar4 = (tzg) tpeVar2.l();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        tze tzeVar = (tze) tpeVar.b;
        tzgVar4.getClass();
        tzeVar.k = tzgVar4;
        tzeVar.b |= 268435456;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oor b() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oca.b():oor");
    }

    public final void c(int[] iArr) {
        if (this.a.c()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
    }

    public final void d(int i) {
        tpe tpeVar = this.n;
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        tze tzeVar = (tze) tpeVar.b;
        tze tzeVar2 = tze.a;
        tzeVar.b |= 32;
        tzeVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(clFzVRcygwbq.paO);
        sb.append(this.g);
        sb.append(", logSourceName: ");
        sb.append(this.h);
        sb.append(", qosTier: 0, veMessage: null, testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList != null ? obz.a(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? obz.a(arrayList2) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? obz.a(arrayList3) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
