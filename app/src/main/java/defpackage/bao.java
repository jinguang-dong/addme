package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bao extends ayk {
    public static final utl k = utm.a(bfb.a);
    private static final AtomicReference s = new AtomicReference(false);
    public long a;
    public final axu b;
    public final Object c;
    public uol d;
    public Throwable e;
    public final bdp f;
    public final List g;
    public Set h;
    public umk i;
    public boolean j;
    public final utl l;
    public zw m;
    public final zu n;
    public final zu o;
    public final zu p;
    public final bay q;
    public final byz r;
    private final List t;
    private List u;
    private final List v;
    private List w;
    private final uhf x;
    private final uon y;
    private ejs z;

    public bao(uhf uhfVar) {
        axu axuVar = new axu(new apa(this, 6));
        this.b = axuVar;
        this.c = new Object();
        this.t = new ArrayList();
        this.m = new zw((byte[]) null);
        this.f = new bdp(new ayn[16]);
        this.v = new ArrayList();
        this.g = new ArrayList();
        this.n = new zu((byte[]) null);
        this.r = new byz((char[]) null, (byte[]) null);
        long[] jArr = zv.a;
        this.o = new zu((byte[]) null);
        this.p = new zu((byte[]) null);
        this.l = utm.a(bak.c);
        new pmg((byte[]) null);
        uon uonVar = new uon((uol) uhfVar.get(uol.c));
        uonVar.o(new arc(this, 5));
        this.y = uonVar;
        this.x = uhfVar.plus(axuVar).plus(uonVar);
        this.q = new bay();
    }

    public static final void D(bgf bgfVar) {
        try {
            if (bgfVar.c() instanceof bgl) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bgfVar.d();
        }
    }

    private static final void F(bao baoVar, azq azqVar, azq azqVar2) {
        List list = azqVar2.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                azq azqVar3 = (azq) list.get(i);
                byz byzVar = baoVar.r;
                azp azpVar = azqVar3.a;
                ebn ebnVar = new ebn(azqVar3, azqVar);
                bdl.b((zu) byzVar.b, azpVar, ebnVar);
                bdl.b((zu) byzVar.a, ebnVar.a, azpVar);
                F(baoVar, azqVar, azqVar3);
            }
        }
    }

    private final boolean G() {
        return this.f.b != 0 || x() || this.n.d();
    }

    private static final void H(List list, bao baoVar, ayn aynVar) {
        list.clear();
        synchronized (baoVar.c) {
            Iterator it = baoVar.g.iterator();
            while (it.hasNext()) {
                azq azqVar = (azq) it.next();
                if (a.ao(azqVar.g, aynVar)) {
                    list.add(azqVar);
                    it.remove();
                }
            }
        }
    }

    private final void I(ayn aynVar) {
        if (this.t.remove(aynVar)) {
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Throwable th, ayn aynVar) throws Throwable {
        if (!((Boolean) s.get()).booleanValue() || (th instanceof axz)) {
            synchronized (this.c) {
                ejs ejsVar = this.z;
                if (ejsVar != null) {
                    throw ((Throwable) ejsVar.a);
                }
                this.z = new ejs(th, (byte[]) null);
            }
            throw th;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.v.clear();
            this.f.g();
            this.m = new zw((byte[]) null);
            this.g.clear();
            this.n.i();
            this.o.i();
            this.z = new ejs(th, (byte[]) null);
            if (aynVar != null) {
                A(aynVar);
            }
            u();
        }
    }

    public final void A(ayn aynVar) {
        List arrayList = this.w;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.w = arrayList;
        }
        if (!arrayList.contains(aynVar)) {
            arrayList.add(aynVar);
        }
        I(aynVar);
    }

    @Override // defpackage.ayk
    public final long a() {
        return 1000L;
    }

    @Override // defpackage.ayk
    public final ayj b() {
        return null;
    }

    @Override // defpackage.ayk
    public final uhf c() {
        return this.x;
    }

    @Override // defpackage.ayk
    public final void d(azq azqVar) {
        umk umkVarU;
        synchronized (this.c) {
            bdl.b(this.n, azqVar.a, azqVar);
            if (azqVar.f != null) {
                F(this, azqVar, azqVar);
            }
            umkVarU = u();
        }
        if (umkVarU != null) {
            umkVarU.fW(ufg.a);
        }
    }

    public final List e() {
        List arrayList = this.u;
        if (arrayList == null) {
            List list = this.t;
            arrayList = list.isEmpty() ? ufw.a : new ArrayList(list);
            this.u = arrayList;
        }
        return arrayList;
    }

    @Override // defpackage.ayk
    public final void g(Set set) {
    }

    @Override // defpackage.ayk
    public final boolean k() {
        return ((Boolean) s.get()).booleanValue();
    }

    @Override // defpackage.ayk
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ayk
    public final boolean m() {
        return false;
    }

    @Override // defpackage.ayk
    public final void o(ayn aynVar, uiu uiuVar) throws Throwable {
        boolean zO = aynVar.o();
        try {
            bqs bqsVar = null;
            byte b = 0;
            bgf bgfVarG = bay.G(new arc(aynVar, 4), new adp(aynVar, 0 == true ? 1 : 0, 9, 0 == true ? 1 : 0));
            try {
                bgj bgjVarW = bgfVarG.w();
                try {
                    synchronized (aynVar.b) {
                        aynVar.l();
                        zu zuVarP = aynVar.p();
                        try {
                            ayn.q();
                            ayg aygVar = aynVar.h;
                            if (!aygVar.d.i()) {
                                ayi.i("Expected applyChanges() to have been called");
                            }
                            try {
                                aygVar.aj(zuVarP, uiuVar);
                            } finally {
                                aygVar.B = null;
                            }
                        } catch (Throwable th) {
                            aynVar.l = zuVarP;
                            throw th;
                        }
                    }
                    if (!zO) {
                        bay.C();
                    }
                    synchronized (this.c) {
                        if (((bak) this.l.c()).compareTo(bak.b) > 0 && !e().contains(aynVar)) {
                            this.t.add(aynVar);
                            this.u = null;
                        }
                    }
                    try {
                        synchronized (this.c) {
                            List list = this.g;
                            int size = list.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (a.ao(((azq) list.get(i)).g, aynVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    H(arrayList, this, aynVar);
                                    while (!arrayList.isEmpty()) {
                                        B(arrayList, null);
                                        H(arrayList, this, aynVar);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        try {
                            aynVar.g();
                            aynVar.h();
                            if (zO) {
                                return;
                            }
                            bay.C();
                        } catch (Throwable th2) {
                            J(th2, null);
                        }
                    } catch (Throwable th3) {
                        J(th3, aynVar);
                    }
                } catch (Throwable th4) {
                    try {
                        Set set = aynVar.c;
                        if (!set.isEmpty()) {
                            bfn bfnVar = aynVar.g;
                            try {
                                bfnVar.g(set, aynVar.h.P());
                                bfnVar.b();
                                bfnVar.a();
                            } catch (Throwable th5) {
                                bfnVar.a();
                                throw th5;
                            }
                        }
                        throw th4;
                    } finally {
                    }
                }
            } finally {
                D(bgfVarG);
            }
        } catch (Throwable th6) {
            J(th6, aynVar);
        }
    }

    @Override // defpackage.ayk
    public final void p(ayn aynVar) {
        umk umkVarU;
        synchronized (this.c) {
            bdp bdpVar = this.f;
            if (bdpVar.l(aynVar)) {
                umkVarU = null;
            } else {
                bdpVar.n(aynVar);
                umkVarU = u();
            }
        }
        if (umkVarU != null) {
            umkVarU.fW(ufg.a);
        }
    }

    @Override // defpackage.ayk
    public final void q(ayn aynVar) {
        synchronized (this.c) {
            Set linkedHashSet = this.h;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.h = linkedHashSet;
            }
            linkedHashSet.add(aynVar);
        }
    }

    @Override // defpackage.ayk
    public final void r(ayn aynVar) {
        synchronized (this.c) {
            I(aynVar);
            this.f.m(aynVar);
            this.v.remove(aynVar);
        }
    }

    @Override // defpackage.ayk
    public final ejs s(azq azqVar) {
        ejs ejsVar;
        synchronized (this.c) {
            ejsVar = (ejs) this.o.g(azqVar);
        }
        return ejsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Comparable] */
    @Override // defpackage.ayk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.azq r19, defpackage.ejs r20, defpackage.axr r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bao.t(azq, ejs, axr):void");
    }

    public final umk u() {
        bak bakVar;
        utl utlVar = this.l;
        if (((bak) utlVar.c()).compareTo(bak.b) <= 0) {
            this.t.clear();
            this.u = ufw.a;
            this.m = new zw((byte[]) null);
            this.f.g();
            this.v.clear();
            this.g.clear();
            this.w = null;
            umk umkVar = this.i;
            if (umkVar != null) {
                umkVar.g(null);
            }
            this.i = null;
            this.z = null;
            return null;
        }
        if (this.z != null) {
            bakVar = bak.c;
        } else if (this.d == null) {
            this.m = new zw((byte[]) null);
            this.f.g();
            bakVar = x() ? bak.d : bak.c;
        } else {
            bakVar = (this.f.b == 0 && !this.m.c() && this.v.isEmpty() && this.g.isEmpty() && !x() && !this.n.d()) ? bak.e : bak.f;
        }
        utlVar.e(bakVar);
        if (bakVar != bak.f) {
            return null;
        }
        umk umkVar2 = this.i;
        this.i = null;
        return umkVar2;
    }

    public final void v() {
        synchronized (this.c) {
            utl utlVar = this.l;
            if (((bak) utlVar.c()).compareTo(bak.e) >= 0) {
                utlVar.e(bak.b);
            }
        }
        this.y.s(null);
    }

    public final void w() {
        synchronized (this.c) {
            this.j = true;
        }
    }

    public final boolean x() {
        return !this.j && (this.b.b.get() & 134217727) > 0;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.m.c() && this.f.b == 0) {
                if (!x()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.lang.Object[]] */
    public final boolean z() {
        List listE;
        boolean zG;
        AtomicReference atomicReference;
        Object obj;
        bdr bdrVar;
        synchronized (this.c) {
            if (this.m.b()) {
                return G();
            }
            bdr bdrVar2 = new bdr(this.m);
            this.m = new zw((byte[]) null);
            synchronized (this.c) {
                listE = e();
            }
            try {
                int size = listE.size();
                for (int i = 0; i < size; i++) {
                    ayn aynVar = (ayn) listE.get(i);
                    do {
                        atomicReference = aynVar.a;
                        obj = atomicReference.get();
                        if (obj == null || a.ao(obj, ayo.a)) {
                            bdrVar = bdrVar2;
                        } else if (obj instanceof Set) {
                            bdrVar = new Set[]{obj, bdrVar2};
                        } else {
                            if (!(obj instanceof Object[])) {
                                AtomicReference atomicReference2 = aynVar.a;
                                Objects.toString(atomicReference2);
                                throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                            }
                            Set[] setArr = (Set[]) obj;
                            int length = setArr.length;
                            ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                            CopyOf[length] = bdrVar2;
                            CopyOf.getClass();
                            bdrVar = CopyOf;
                        }
                    } while (!a.v(atomicReference, obj, bdrVar));
                    if (obj == null) {
                        synchronized (aynVar.b) {
                            aynVar.m();
                        }
                    }
                    if (((bak) this.l.c()).compareTo(bak.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    this.m = new zw((byte[]) null);
                }
                synchronized (this.c) {
                    if (u() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zG = G();
                }
                return zG;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.m.k(bdrVar2);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:126|(1:128)(1:129)|(11:(36:131|(1:133)|134|(1:136)|137|(1:139)(1:140)|(1:142)|145|294|146|147|(4:149|(1:151)|152|(1:154))|155|284|156|273|157|268|158|159|262|160|161|260|162|163|258|164|165|264|166|271|167|280|168|169)(1:143)|258|164|165|264|166|271|167|280|168|169)|144|145|294|146|147|(0)|155|284|156|273|157|268|158|159|262|160|161|260|162|163) */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0429, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x042b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x042c, code lost:
    
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a9, code lost:
    
        r1 = r11.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        if (r2 >= r1) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b8, code lost:
    
        if (((defpackage.uev) r11.get(r2)).b == null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ba, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
    
        r1 = new java.util.ArrayList(r11.size());
        r2 = r11.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        if (r3 >= r2) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cd, code lost:
    
        r4 = (defpackage.uev) r11.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        if (r4.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d7, code lost:
    
        r4 = (defpackage.azq) r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dc, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dd, code lost:
    
        if (r4 == null) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01df, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e5, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e6, code lost:
    
        defpackage.ske.bT(r0.g, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01eb, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ec, code lost:
    
        r1 = new java.util.ArrayList(r11.size());
        r2 = r11.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        if (r3 >= r2) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fc, code lost:
    
        r4 = r11.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0205, code lost:
    
        if (((defpackage.uev) r4).b == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0207, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020d, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035d A[Catch: all -> 0x047b, TryCatch #9 {all -> 0x047b, blocks: (B:115:0x02c1, B:170:0x0411, B:124:0x02d9, B:125:0x02dc, B:126:0x02dd, B:128:0x02e6, B:131:0x02ed, B:133:0x02f8, B:134:0x02fd, B:136:0x0304, B:137:0x030a, B:139:0x031c, B:144:0x033c, B:145:0x033e, B:147:0x0354, B:149:0x035d, B:151:0x0365, B:152:0x0371, B:154:0x0379, B:155:0x0389, B:169:0x040e, B:196:0x044a, B:197:0x044d, B:199:0x044f, B:200:0x0452, B:140:0x032a, B:129:0x02e9, B:205:0x0457, B:146:0x034a), top: B:275:0x02c1, inners: #20 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List B(java.util.List r31, defpackage.zw r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bao.B(java.util.List, zw):java.util.List");
    }
}
