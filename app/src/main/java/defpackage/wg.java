package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wg implements Closeable {
    public final Map a;
    public final List b;
    public final und c;
    public final Object d;
    public rb e;
    public rb f;
    public Map g;
    public Map h;
    public wi i;
    public final qqq j;
    private final po k;
    private final Map l;
    private final List m;
    private final und n;
    private volatile boolean o;
    private wi p;
    private final uly q;

    public wg(po poVar, Map map, Map map2, List list, List list2, und undVar, una unaVar) {
        this.k = poVar;
        this.l = map;
        this.a = map2;
        this.m = list;
        this.b = list2;
        this.c = undVar;
        und undVarJ = ung.j(unaVar.plus(new unc("CXCP-GraphLoop")));
        this.n = undVarJ;
        qqq qqqVar = new qqq(new aek((Object) this, 1, (byte[]) null), new wf(this));
        if (!((uly) qqqVar.c).b()) {
            throw new IllegalStateException("ProcessingQueue cannot be re-started!");
        }
        if (ukc.C(undVarJ, null, 0, new si(qqqVar, (uhb) null, 5), 3).fZ()) {
            qqqVar.L(null);
        }
        this.j = qqqVar;
        this.d = new Object();
        ufx ufxVar = ufx.a;
        this.q = new uly(true, umc.a);
        this.g = ufxVar;
        this.h = map2;
    }

    static /* synthetic */ boolean j(wg wgVar, boolean z, List list) throws Exception {
        wi wiVar = wgVar.i;
        if (wiVar == null) {
            return false;
        }
        boolean zC = wiVar.c(z, list, wgVar.l, wgVar.g, wgVar.h, wgVar.m);
        if (!zC) {
            if (z) {
                Object objBH = ske.bH(list);
                Objects.toString(objBH);
                Log.w("CXCP", "Failed to repeat with ".concat(String.valueOf(objBH)));
                return zC;
            }
            Objects.toString(list);
            Log.w("CXCP", "Failed to submit capture with ".concat(list.toString()));
        }
        return zC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r15.d() == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (r1.d() != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ce, code lost:
    
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00db -> B:35:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r18, int r19, defpackage.vy r20, defpackage.uhb r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.a(java.util.List, int, vy, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r13.d() != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r8.d() == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (r3.d() != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b9 -> B:45:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c9 -> B:45:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cd -> B:45:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r12, defpackage.uhb r13) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.b(java.util.List, uhb):java.lang.Object");
    }

    public final void c(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rb rbVar = (rb) list.get(i);
            List list2 = this.m;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ra) list2.get(i2)).a(rbVar);
            }
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            rb rbVar2 = (rb) list.get(i3);
            List list3 = rbVar2.c;
            int size4 = list3.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((ra) list3.get(i4)).a(rbVar2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.o) {
                return;
            }
            this.o = true;
            wi wiVar = this.p;
            if (wiVar != null) {
                ukc.C(this.c, null, 0, new vf(wiVar, (uhb) null, 2), 3);
            }
            this.p = null;
            this.j.M(vv.c);
            List list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((wc) list.get(i)).o();
            }
        }
    }

    public final void d() {
        this.j.M(vv.a);
    }

    public final void e(List list, int i, vu vuVar, boolean z) {
        if (i() && j(this, false, vuVar.a)) {
            list.remove(i);
            return;
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (!(((wa) list.get(i2)) instanceof vx)) {
            throw new IllegalStateException("Check failed.");
        }
        f(list, i2, false);
    }

    public final void f(List list, int i, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (i3 < 0) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                wa waVar = (wa) list.get(i2);
                if (waVar instanceof vu) {
                    e(list, i2, (vu) waVar, false);
                    return;
                } else {
                    if (waVar instanceof vz) {
                        k(list, i2);
                        return;
                    }
                    return;
                }
            }
            wa waVar2 = (wa) list.get(i3);
            if (waVar2 instanceof vx) {
                rb rbVar = ((vx) waVar2).a;
                if (j(this, true, ske.bj(rbVar))) {
                    this.f = rbVar;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((wa) list.get(i4)) instanceof vx) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    public final void g(boolean z) {
        this.q.a = z ? 1 : 0;
        if (z) {
            d();
        }
    }

    public final void h(wi wiVar) {
        synchronized (this.d) {
            wi wiVar2 = this.p;
            this.p = wiVar;
            if (this.o) {
                this.p = null;
                if (wiVar != null) {
                    ukc.C(this.c, null, 0, new vf(wiVar, (uhb) null, 4, (byte[]) null), 3);
                }
                return;
            }
            if (wiVar2 != wiVar) {
                this.j.M(new vy(wiVar2, wiVar));
            }
            if (wiVar == null) {
                List list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((wc) list.get(i)).p();
                }
            }
        }
    }

    public final boolean i() {
        return this.q.a();
    }

    public final void k(List list, int i) {
        rb rbVar = this.f;
        if (rbVar == null && i == 0) {
            list.remove(0);
            return;
        }
        if (i() && rbVar != null) {
            ske.bj(rbVar);
            throw null;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (!(((wa) list.get(i2)) instanceof vx)) {
                throw new IllegalStateException("Check failed.");
            }
            f(list, i2, false);
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.k + ')';
    }
}
