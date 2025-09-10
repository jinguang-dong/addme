package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovo {
    public final Object a;
    public int b;
    public final Object c;
    public final Object d;
    private final Object e;

    public ovo(rnu rnuVar) {
        this.a = new cnk(30);
        this.d = new ArrayList();
        this.c = new ArrayList();
        this.b = 0;
        this.e = rnuVar;
    }

    private final int n(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hl hlVar = (hl) arrayList.get(size);
            int i3 = hlVar.a;
            int i4 = hlVar.b;
            if (i4 <= i) {
                if (i3 == 1) {
                    i -= hlVar.d;
                } else if (i3 == 2) {
                    i += hlVar.d;
                }
            } else if (i2 == 1) {
                hlVar.b = i4 + 1;
            } else if (i2 == 2) {
                hlVar.b = i4 - 1;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            hl hlVar2 = (hl) arrayList.get(size2);
            int i5 = hlVar2.a;
            if (hlVar2.d <= 0) {
                arrayList.remove(size2);
                i(hlVar2);
            }
        }
    }

    private final void o(hl hlVar) {
        int i;
        int i2 = hlVar.a;
        if (i2 == 1) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iN = n(hlVar.b, i2);
        int i3 = hlVar.b;
        int i4 = hlVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(hlVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(hlVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < hlVar.d; i6++) {
            int iN2 = n(hlVar.b + (i * i6), hlVar.a);
            int i7 = hlVar.a;
            if (i7 == 2 ? iN2 != iN : !(i7 == 4 && iN2 == iN + 1)) {
                hl hlVarD = d(i7, iN, i5, hlVar.c);
                g(hlVarD, i3);
                i(hlVarD);
                if (hlVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iN = iN2;
            } else {
                i5++;
            }
        }
        Object obj = hlVar.c;
        i(hlVar);
        if (i5 > 0) {
            hl hlVarD2 = d(hlVar.a, iN, i5, obj);
            g(hlVarD2, i3);
            i(hlVarD2);
        }
    }

    private final void p(hl hlVar) {
        ((ArrayList) this.c).add(hlVar);
        int i = hlVar.a;
        if (i == 1) {
            ((rnu) this.e).u(hlVar.b, hlVar.d);
        } else {
            if (i != 2) {
                if (i != 4) {
                    Objects.toString(hlVar);
                    throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(hlVar)));
                }
                ((rnu) this.e).t(hlVar.b, hlVar.d, hlVar.c);
                return;
            }
            Object obj = this.e;
            int i2 = hlVar.b;
            int i3 = hlVar.d;
            RecyclerView recyclerView = (RecyclerView) ((rnu) obj).a;
            recyclerView.P(i2, i3, false);
            recyclerView.P = true;
        }
    }

    private final boolean q(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            hl hlVar = (hl) arrayList.get(i2);
            if (hlVar.a == 1) {
                int i4 = hlVar.b;
                int i5 = hlVar.d + i4;
                while (i4 < i5) {
                    if (c(i4, i3) == i) {
                        return true;
                    }
                    i4++;
                }
            }
            i2 = i3;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, pai] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu a(Runnable runnable) {
        Object objA;
        synchronized (this.a) {
            if (this.b >= 2) {
                objA = this.e.a(this.d);
                if (objA == null) {
                    return ske.M(false);
                }
                this.b--;
            } else {
                objA = null;
            }
            ovp ovpVar = new ovp(runnable);
            this.d.add(ovpVar);
            this.b++;
            try {
                this.c.execute(new mvn(this, 15));
            } catch (RejectedExecutionException unused) {
                synchronized (this.a) {
                    ovp ovpVar2 = (ovp) this.d.pollFirst();
                    if (ovpVar2 != null) {
                        ovpVar2.b.e(false);
                    }
                    this.b--;
                }
            }
            if (objA != null) {
                ((ovp) objA).b.e(false);
            }
            return ovpVar.b;
        }
    }

    public final int b(int i) {
        return c(i, 0);
    }

    final int c(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (i2 < size) {
            hl hlVar = (hl) arrayList.get(i2);
            int i3 = hlVar.a;
            int i4 = hlVar.b;
            if (i4 <= i) {
                if (i3 == 2) {
                    int i5 = hlVar.d;
                    if (i < i4 + i5) {
                        return -1;
                    }
                    i -= i5;
                } else if (i3 == 1) {
                    i += hlVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cnj, java.lang.Object] */
    public final hl d(int i, int i2, int i3, Object obj) {
        hl hlVar = (hl) this.a.a();
        if (hlVar == null) {
            return new hl(i, i2, i3, obj);
        }
        hlVar.a = i;
        hlVar.b = i2;
        hlVar.d = i3;
        hlVar.c = obj;
        return hlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void e() {
        ?? r0 = this.c;
        ArrayList arrayList = (ArrayList) r0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rnu) this.e).s((hl) arrayList.get(i));
        }
        j(r0);
        this.b = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void f() {
        e();
        ?? r0 = this.d;
        ArrayList arrayList = (ArrayList) r0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hl hlVar = (hl) arrayList.get(i);
            int i2 = hlVar.a;
            if (i2 == 1) {
                rnu rnuVar = (rnu) this.e;
                rnuVar.s(hlVar);
                rnuVar.u(hlVar.b, hlVar.d);
            } else if (i2 == 2) {
                rnu rnuVar2 = (rnu) this.e;
                rnuVar2.s(hlVar);
                rnuVar2.v(hlVar.b, hlVar.d);
            } else if (i2 == 4) {
                rnu rnuVar3 = (rnu) this.e;
                rnuVar3.s(hlVar);
                rnuVar3.t(hlVar.b, hlVar.d, hlVar.c);
            }
        }
        j(r0);
        this.b = 0;
    }

    final void g(hl hlVar, int i) {
        rnu rnuVar = (rnu) this.e;
        rnuVar.s(hlVar);
        int i2 = hlVar.a;
        if (i2 == 2) {
            rnuVar.v(i, hlVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            rnuVar.t(i, hlVar.d, hlVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void h() {
        boolean z;
        boolean z2;
        ?? r0 = this.d;
        for (int size = r0.size() - 1; size >= 0; size--) {
            int i = ((hl) r0.get(size)).a;
        }
        ArrayList arrayList = (ArrayList) r0;
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hl hlVarD = (hl) arrayList.get(i2);
            int i3 = hlVarD.a;
            if (i3 == 1) {
                p(hlVarD);
            } else if (i3 == 2) {
                int i4 = hlVarD.b;
                int i5 = hlVarD.d + i4;
                boolean z3 = -1;
                int i6 = 0;
                int i7 = i4;
                while (i7 < i5) {
                    if (((rnu) this.e).r(i7) != null || q(i7)) {
                        if (z3) {
                            z = false;
                        } else {
                            o(d(2, i4, i6, null));
                            z = true;
                        }
                        z2 = true;
                    } else {
                        if (z3) {
                            p(d(2, i4, i6, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = false;
                    }
                    if (z) {
                        i7 -= i6;
                        i5 -= i6;
                        i6 = 1;
                    } else {
                        i6++;
                    }
                    i7++;
                    z3 = z2;
                }
                if (i6 != hlVarD.d) {
                    i(hlVarD);
                    hlVarD = d(2, i4, i6, null);
                }
                if (z3) {
                    p(hlVarD);
                } else {
                    o(hlVarD);
                }
            } else if (i3 == 4) {
                int i8 = hlVarD.b;
                int i9 = hlVarD.d + i8;
                boolean z4 = -1;
                int i10 = 0;
                int i11 = i8;
                while (i8 < i9) {
                    if (((rnu) this.e).r(i8) != null || q(i8)) {
                        if (!z4) {
                            o(d(4, i11, i10, hlVarD.c));
                            i10 = 0;
                            i11 = i8;
                        }
                        z4 = true;
                    } else {
                        if (z4) {
                            p(d(4, i11, i10, hlVarD.c));
                            i10 = 0;
                            i11 = i8;
                        }
                        z4 = false;
                    }
                    i10++;
                    i8++;
                }
                if (i10 != hlVarD.d) {
                    Object obj = hlVarD.c;
                    i(hlVarD);
                    hlVarD = d(4, i11, i10, obj);
                }
                if (z4) {
                    p(hlVarD);
                } else {
                    o(hlVarD);
                }
            }
        }
        arrayList.clear();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cnj, java.lang.Object] */
    public final void i(hl hlVar) {
        hlVar.c = null;
        this.a.b(hlVar);
    }

    final void j(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i((hl) list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void k() {
        j(this.d);
        j(this.c);
        this.b = 0;
    }

    public final boolean l(int i) {
        return (this.b & i) != 0;
    }

    public final boolean m() {
        return ((ArrayList) this.d).size() > 0;
    }

    public ovo(Executor executor, pai paiVar) {
        this.a = new Object();
        this.d = new ArrayDeque();
        this.b = 0;
        a.I(true);
        this.c = executor;
        this.e = paiVar;
    }
}
