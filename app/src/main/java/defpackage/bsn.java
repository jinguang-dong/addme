package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsn implements axy {
    public final bvm a;
    public ayk b;
    public btu c;
    public int d;
    public int e;
    public final bsf f;
    public final bsc g;
    public final bdp h;
    public int i;
    public int j;
    public final String k;
    public final zu l;
    public final zu m;
    public final zu n;
    public final zu o;
    private final btt p;

    public bsn(bvm bvmVar, btu btuVar) {
        this.a = bvmVar;
        this.c = btuVar;
        long[] jArr = zv.a;
        this.l = new zu((byte[]) null);
        this.m = new zu((byte[]) null);
        this.f = new bsf(this);
        this.g = new bsc(this);
        this.n = new zu((byte[]) null);
        this.p = new btt(null);
        this.o = new zu((byte[]) null);
        this.h = new bdp(new Object[16]);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bwp, bws] */
    private final bwp l() {
        ?? A = bvp.a(this.a);
        if (((bxv) A).isAttachedToWindow()) {
            return A;
        }
        return null;
    }

    private final Object m(List list, int i) {
        Object objA = this.l.a((bvm) list.get(i));
        objA.getClass();
        return ((bsd) objA).a;
    }

    private static final void n(bsd bsdVar, bwp bwpVar) {
        bsdVar.b();
        bsl bslVar = new bsl(bsdVar, 0);
        Handler handler = ((bxv) bwpVar).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new mb(bslVar, 7));
    }

    private static final void o(bvm bvmVar) {
        bvmVar.m().E = 3;
        bvx bvxVarL = bvmVar.l();
        if (bvxVarL != null) {
            bvxVarL.w = 3;
        }
    }

    public final btr a(Object obj, uiu uiuVar) {
        bvm bvmVar = this.a;
        if (bvmVar.ag()) {
            h();
            if (!zu.e(this.m, obj)) {
                this.o.g(obj);
                zu zuVar = this.n;
                Object objA = zuVar.a(obj);
                if (objA == null) {
                    objA = e(obj);
                    if (objA != null) {
                        j(bvmVar.u().indexOf(objA), bvmVar.u().size());
                        this.j++;
                    } else {
                        objA = d(bvmVar.u().size());
                        this.j++;
                    }
                    zuVar.j(obj, objA);
                }
                k((bvm) objA, obj, uiuVar);
            }
        }
        return !bvmVar.ag() ? new bsj() : new bsk(this, obj);
    }

    @Override // defpackage.axy
    public final void b() {
        i(true);
    }

    @Override // defpackage.axy
    public final void c() {
        f();
    }

    public final bvm d(int i) {
        bvm bvmVar = new bvm(true, 2, null);
        bvm bvmVar2 = this.a;
        bvmVar2.k = true;
        bvmVar2.D(i, bvmVar);
        bvmVar2.k = false;
        return bvmVar;
    }

    public final bvm e(Object obj) {
        int i;
        if (this.i == 0) {
            return null;
        }
        List listU = this.a.u();
        int size = listU.size() - this.j;
        int i2 = size - this.i;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (a.ao(m(listU, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object objA = this.l.a((bvm) listU.get(i3));
                objA.getClass();
                bsd bsdVar = (bsd) objA;
                Object obj2 = bsdVar.a;
                if (obj2 == btq.a || this.c.b(obj, obj2)) {
                    bsdVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            j(i4, i2);
        }
        this.i--;
        bvm bvmVar = (bvm) listU.get(i2);
        Object objA2 = this.l.a(bvmVar);
        objA2.getClass();
        bsd bsdVar2 = (bsd) objA2;
        bsdVar2.e = new azz(true, bap.c);
        bsdVar2.d = true;
        bsdVar2.c = true;
        return bvmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r18 = this;
            r0 = r18
            bvm r1 = r0.a
            r2 = 1
            r1.k = r2
            zu r2 = r0.l
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            r11 = r6
        L27:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L47
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            bsd r12 = (defpackage.bsd) r12
            ayn r12 = r12.g
            if (r12 == 0) goto L47
            r12.d()
        L47:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L27
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.O()
            r1.k = r6
            r2.i()
            zu r1 = r0.m
            r1.i()
            r0.j = r6
            r0.i = r6
            zu r1 = r0.n
            r1.i()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsn.f():void");
    }

    public final void g(int i) {
        this.i = 0;
        bvm bvmVar = this.a;
        List listU = bvmVar.u();
        int size = (listU.size() - this.j) - 1;
        if (i <= size) {
            btt bttVar = this.p;
            bttVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    bttVar.add(m(listU, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(bttVar);
            bwp bwpVarL = l();
            bgj bgjVarA = bay.A();
            uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgj bgjVarB = bay.B(bgjVarA);
            boolean z = false;
            while (size >= i) {
                try {
                    bvm bvmVar2 = (bvm) listU.get(size);
                    zu zuVar = this.l;
                    Object objA = zuVar.a(bvmVar2);
                    objA.getClass();
                    bsd bsdVar = (bsd) objA;
                    Object obj = bsdVar.a;
                    if (bttVar.contains(obj)) {
                        this.i++;
                        if (bsdVar.a()) {
                            o(bvmVar2);
                            if (bwpVarL != null) {
                                n(bsdVar, bwpVarL);
                            } else {
                                bsdVar.b();
                                if (bsdVar.f) {
                                    z = true;
                                } else {
                                    ayn aynVar = bsdVar.g;
                                    if (aynVar != null) {
                                        aynVar.k();
                                    }
                                }
                            }
                        }
                    } else {
                        bvmVar.k = true;
                        zuVar.g(bvmVar2);
                        ayn aynVar2 = bsdVar.g;
                        if (aynVar2 != null) {
                            aynVar2.d();
                        }
                        bvmVar.P(size, 1);
                        bvmVar.k = false;
                    }
                    this.m.g(obj);
                    size--;
                } finally {
                    bay.E(bgjVarA, bgjVarB, uiqVarI);
                }
            }
            if (z) {
                bay.F();
            }
        }
        h();
    }

    public final void h() {
        int size = this.a.u().size();
        zu zuVar = this.l;
        if (zuVar.e != size) {
            bqs.b("Inconsistency between the count of nodes tracked by the state (" + zuVar.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.i) - this.j < 0) {
            bqs.b("Incorrect state. Total children " + size + ". Reusable children " + this.i + ". Precomposed children " + this.j);
        }
        zu zuVar2 = this.n;
        if (zuVar2.e == this.j) {
            return;
        }
        bqs.b("Incorrect state. Precomposed children " + this.j + ". Map size " + zuVar2.e);
    }

    public final void i(boolean z) {
        ayn aynVar;
        this.j = 0;
        this.n.i();
        List listU = this.a.u();
        int size = listU.size();
        if (this.i != size) {
            this.i = size;
            bwp bwpVarL = l();
            bgj bgjVarA = bay.A();
            uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgj bgjVarB = bay.B(bgjVarA);
            for (int i = 0; i < size; i++) {
                try {
                    bvm bvmVar = (bvm) listU.get(i);
                    bsd bsdVar = (bsd) this.l.a(bvmVar);
                    if (bsdVar != null && bsdVar.a()) {
                        o(bvmVar);
                        if (z) {
                            ayn aynVar2 = bsdVar.g;
                            if (aynVar2 != null) {
                                aynVar2.k();
                            }
                            bsdVar.e = new azz(false, bap.c);
                        } else if (bwpVarL != null) {
                            n(bsdVar, bwpVarL);
                        } else {
                            bsdVar.b();
                            if (!bsdVar.f && (aynVar = bsdVar.g) != null) {
                                aynVar.k();
                            }
                        }
                        bsdVar.a = btq.a;
                    }
                } catch (Throwable th) {
                    bay.E(bgjVarA, bgjVarB, uiqVarI);
                    throw th;
                }
            }
            bay.E(bgjVarA, bgjVarB, uiqVarI);
            this.m.i();
        }
        h();
    }

    public final void j(int i, int i2) {
        bvm bvmVar = this.a;
        bvmVar.k = true;
        bvmVar.M(i, i2, 1);
        bvmVar.k = false;
    }

    public final void k(bvm bvmVar, Object obj, uiu uiuVar) {
        boolean z;
        zu zuVar = this.l;
        Object objA = zuVar.a(bvmVar);
        if (objA == null) {
            objA = new bsd(obj, brh.a);
            zuVar.j(bvmVar, objA);
        }
        bsd bsdVar = (bsd) objA;
        uiu uiuVar2 = bsdVar.b;
        ayn aynVar = bsdVar.g;
        if (aynVar != null) {
            synchronized (aynVar.b) {
                z = aynVar.l.e > 0;
            }
        } else {
            z = true;
        }
        if (uiuVar2 != uiuVar || z || bsdVar.c) {
            bsdVar.b = uiuVar;
            bgj bgjVarA = bay.A();
            uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgj bgjVarB = bay.B(bgjVarA);
            try {
                bvm bvmVar2 = this.a;
                bvmVar2.k = true;
                ayn aynVar2 = bsdVar.g;
                ayk aykVar = this.b;
                if (aykVar == null) {
                    bqs.a("parent composition reference not set");
                    throw new uer();
                }
                if (aynVar2 == null || aynVar2.i) {
                    ViewGroup.LayoutParams layoutParams = cao.a;
                    aynVar2 = new ayn(aykVar, new bxe(bvmVar));
                }
                bsdVar.g = aynVar2;
                uiu bfhVar = bsdVar.b;
                if (l() != null) {
                    bsdVar.f = false;
                } else {
                    bsdVar.f = true;
                    bfhVar = new bfh(1524156494, true, new bsm(bsdVar, bfhVar, 0));
                }
                if (bsdVar.d) {
                    ayg aygVar = aynVar2.h;
                    aygVar.k = 100;
                    aygVar.j = true;
                    aynVar2.j(bfhVar);
                    if (aygVar.n || aygVar.k != 100) {
                        bad.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    aygVar.k = -1;
                    aygVar.j = false;
                } else {
                    aynVar2.j(bfhVar);
                }
                bsdVar.d = false;
                bvmVar2.k = false;
                bay.E(bgjVarA, bgjVarB, uiqVarI);
                bsdVar.c = false;
            } catch (Throwable th) {
                bay.E(bgjVarA, bgjVarB, uiqVarI);
                throw th;
            }
        }
    }
}
