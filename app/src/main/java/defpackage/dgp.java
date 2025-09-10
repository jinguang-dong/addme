package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dgp implements Cloneable {
    public ArrayList i;
    public ArrayList j;
    long p;
    public dgl q;
    long r;
    public com s;
    private dgm[] y;
    private static final Animator[] u = new Animator[0];
    private static final int[] v = {2, 1, 3, 4};
    private static final com C = new com(null);
    private static final ThreadLocal w = new ThreadLocal();
    private final String x = getClass().getName();
    public long a = -1;
    long b = -1;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public dgz e = new dgz();
    public dgz f = new dgz();
    dgx g = null;
    public final int[] h = v;
    final ArrayList k = new ArrayList();
    private Animator[] z = u;
    int l = 0;
    private boolean A = false;
    boolean m = false;
    public dgp n = null;
    private ArrayList B = null;
    public ArrayList o = new ArrayList();
    public com t = C;

    private static boolean N(dgy dgyVar, dgy dgyVar2, String str) {
        Map map = dgyVar2.a;
        Object obj = dgyVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(dgz dgzVar, View view, dgy dgyVar) {
        ((aaa) dgzVar.a).put(view, dgyVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) dgzVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = con.a;
        String strE = cog.e(view);
        if (strE != null) {
            aaa aaaVar = (aaa) dgzVar.d;
            if (aaaVar.containsKey(strE)) {
                aaaVar.put(strE, null);
            } else {
                aaaVar.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                zb zbVar = (zb) dgzVar.c;
                if (zbVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zbVar.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) zbVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zbVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            dgy dgyVar = new dgy(view);
            if (z) {
                c(dgyVar);
            } else {
                b(dgyVar);
            }
            dgyVar.c.add(this);
            o(dgyVar);
            if (z) {
                f(this.e, view, dgyVar);
            } else {
                f(this.f, view, dgyVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public static yd h() {
        ThreadLocal threadLocal = w;
        yd ydVar = (yd) threadLocal.get();
        if (ydVar != null) {
            return ydVar;
        }
        yd ydVar2 = new yd();
        threadLocal.set(ydVar2);
        return ydVar2;
    }

    public boolean A() {
        return !this.k.isEmpty();
    }

    public boolean B(dgy dgyVar, dgy dgyVar2) {
        if (dgyVar != null && dgyVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (N(dgyVar, dgyVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = dgyVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (N(dgyVar, dgyVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean C(View view) {
        int id = view.getId();
        ArrayList arrayList = this.c;
        return (arrayList.size() == 0 && this.d.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.d.contains(view);
    }

    public final void D(dgm dgmVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(dgmVar);
    }

    public void E(View view) {
        this.d.add(view);
    }

    public final void F(dgm dgmVar) {
        dgp dgpVar;
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(dgmVar) && (dgpVar = this.n) != null) {
            dgpVar.F(dgmVar);
        }
        if (this.B.size() == 0) {
            this.B = null;
        }
    }

    public void G(View view) {
        this.d.remove(view);
    }

    public void J(long j) {
        this.a = j;
    }

    public void K() {
        this.b = 0L;
    }

    public void L(com comVar) {
        this.s = comVar;
    }

    public void M(com comVar) {
        if (comVar == null) {
            this.t = C;
        } else {
            this.t = comVar;
        }
    }

    public Animator a(ViewGroup viewGroup, dgy dgyVar, dgy dgyVar2) {
        return null;
    }

    public abstract void b(dgy dgyVar);

    public abstract void c(dgy dgyVar);

    public boolean d() {
        throw null;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public dgp clone() {
        try {
            dgp dgpVar = (dgp) super.clone();
            dgpVar.o = new ArrayList();
            dgpVar.e = new dgz();
            dgpVar.f = new dgz();
            dgpVar.i = null;
            dgpVar.j = null;
            dgpVar.q = null;
            dgpVar.n = this;
            dgpVar.B = null;
            return dgpVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final dgp j() {
        dgx dgxVar = this.g;
        return dgxVar != null ? dgxVar.j() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.dgy) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.dgy k(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            dgx r0 = r5.g
            if (r0 == 0) goto L9
            dgy r5 = r0.k(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.i
            goto L10
        Le:
            java.util.ArrayList r0 = r5.j
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            dgy r4 = (defpackage.dgy) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.j
            goto L36
        L34:
            java.util.ArrayList r5 = r5.i
        L36:
            java.lang.Object r5 = r5.get(r3)
            dgy r5 = (defpackage.dgy) r5
            return r5
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgp.k(android.view.View, boolean):dgy");
    }

    public final dgy l(View view, boolean z) {
        dgx dgxVar = this.g;
        if (dgxVar != null) {
            return dgxVar.l(view, z);
        }
        return (dgy) ((aaa) (z ? this.e : this.f).a).get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        ArrayList arrayList = this.c;
        if (arrayList.size() > 0 || this.d.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.d;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void n() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        while (true) {
            size--;
            if (size < 0) {
                this.z = animatorArr;
                t(this, dgo.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        ArrayList arrayList = this.c;
        if (arrayList.size() <= 0 && this.d.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                dgy dgyVar = new dgy(viewFindViewById);
                if (z) {
                    c(dgyVar);
                } else {
                    b(dgyVar);
                    z3 = false;
                }
                dgyVar.c.add(this);
                o(dgyVar);
                if (z3) {
                    f(this.e, viewFindViewById, dgyVar);
                } else {
                    f(this.f, viewFindViewById, dgyVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            dgy dgyVar2 = new dgy(view);
            if (z) {
                c(dgyVar2);
                z2 = true;
            } else {
                b(dgyVar2);
                z2 = false;
            }
            dgyVar2.c.add(this);
            o(dgyVar2);
            if (z2) {
                f(this.e, view, dgyVar2);
            } else {
                f(this.f, view, dgyVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            ((aaa) this.e.a).clear();
            ((SparseArray) this.e.b).clear();
            ((zb) this.e.c).f();
        } else {
            ((aaa) this.f.a).clear();
            ((SparseArray) this.f.b).clear();
            ((zb) this.f.c).f();
        }
    }

    public void r(ViewGroup viewGroup, dgz dgzVar, dgz dgzVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        dgy dgyVar;
        dgy dgyVar2;
        yd ydVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        dgl dglVar = j().q;
        for (int i = 0; i < size; i++) {
            dgy dgyVar3 = (dgy) arrayList.get(i);
            dgy dgyVar4 = (dgy) arrayList2.get(i);
            if (dgyVar3 != null && !dgyVar3.c.contains(this)) {
                dgyVar3 = null;
            }
            if (dgyVar4 != null && !dgyVar4.c.contains(this)) {
                dgyVar4 = null;
            }
            if ((dgyVar3 != null || dgyVar4 != null) && (dgyVar3 == null || dgyVar4 == null || B(dgyVar3, dgyVar4))) {
                Animator animatorA = a(viewGroup, dgyVar3, dgyVar4);
                if (animatorA != null) {
                    if (dgyVar4 != null) {
                        view = dgyVar4.b;
                        String[] strArrE = e();
                        if (strArrE != null) {
                            dgy dgyVar5 = new dgy(view);
                            dgy dgyVar6 = (dgy) ((aaa) dgzVar2.a).get(view);
                            animator = animatorA;
                            if (dgyVar6 != null) {
                                int i2 = 0;
                                while (i2 < strArrE.length) {
                                    Map map = dgyVar5.a;
                                    String[] strArr = strArrE;
                                    String str = strArr[i2];
                                    map.put(str, dgyVar6.a.get(str));
                                    i2++;
                                    strArrE = strArr;
                                }
                            }
                            int i3 = ydVarH.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    dgyVar2 = dgyVar5;
                                    break;
                                }
                                dgk dgkVar = (dgk) ydVarH.get((Animator) ydVarH.d(i4));
                                Object obj = dgkVar.c;
                                if (obj != null && dgkVar.a == view) {
                                    if (((String) dgkVar.b).equals(this.x) && ((dgy) obj).equals(dgyVar5)) {
                                        dgyVar2 = dgyVar5;
                                        animator = null;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            animator = animatorA;
                            dgyVar2 = null;
                        }
                        dgyVar = dgyVar2;
                    } else {
                        animator = animatorA;
                        view = dgyVar3.b;
                        dgyVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        dgk dgkVar2 = new dgk(view2, this.x, this, viewGroup.getWindowId(), dgyVar, animator2);
                        if (dglVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        ydVarH.put(animator2, dgkVar2);
                        this.o.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                dgk dgkVar3 = (dgk) ydVarH.get((Animator) this.o.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                Animator animator3 = (Animator) dgkVar3.f;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    protected final void s() {
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            t(this, dgo.b, false);
            for (int i2 = 0; i2 < ((zb) this.e.c).b(); i2++) {
                View view = (View) ((zb) this.e.c).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((zb) this.f.c).b(); i3++) {
                View view2 = (View) ((zb) this.f.c).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.m = true;
        }
    }

    public final void t(dgp dgpVar, dgo dgoVar, boolean z) {
        dgp dgpVar2 = this.n;
        if (dgpVar2 != null) {
            dgpVar2.t(dgpVar, dgoVar, z);
        }
        ArrayList arrayList = this.B;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.B.size();
        dgm[] dgmVarArr = this.y;
        if (dgmVarArr == null) {
            dgmVarArr = new dgm[size];
        }
        this.y = null;
        dgm[] dgmVarArr2 = (dgm[]) this.B.toArray(dgmVarArr);
        for (int i = 0; i < size; i++) {
            dgoVar.a(dgmVarArr2[i], dgpVar);
            dgmVarArr2[i] = null;
        }
        this.y = dgmVarArr2;
    }

    public final String toString() {
        return m("");
    }

    public void u(View view) {
        if (this.m) {
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        while (true) {
            size--;
            if (size < 0) {
                this.z = animatorArr;
                t(this, dgo.d, false);
                this.A = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void v() {
        yd ydVarH = h();
        this.p = 0L;
        for (int i = 0; i < this.o.size(); i++) {
            Animator animator = (Animator) this.o.get(i);
            dgk dgkVar = (dgk) ydVarH.get(animator);
            if (animator != null && dgkVar != null) {
                if (this.b >= 0) {
                    ((Animator) dgkVar.f).setDuration(0L);
                }
                long j = this.a;
                if (j >= 0) {
                    Animator animator2 = (Animator) dgkVar.f;
                    animator2.setStartDelay(j + animator2.getStartDelay());
                }
                this.k.add(animator);
                this.p = Math.max(this.p, animator.getTotalDuration());
            }
        }
        this.o.clear();
    }

    public void w(View view) {
        if (this.A) {
            if (!this.m) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
                this.z = u;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.z = animatorArr;
                t(this, dgo.e, false);
            }
            this.A = false;
        }
    }

    protected void x() {
        z();
        yd ydVarH = h();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (ydVarH.containsKey(animator)) {
                z();
                if (animator != null) {
                    animator.addListener(new dgi(this, ydVarH));
                    if (this.b >= 0) {
                        animator.setDuration(0L);
                    }
                    long j = this.a;
                    if (j >= 0) {
                        animator.setStartDelay(j + animator.getStartDelay());
                    }
                    animator.addListener(new dgj(this));
                    animator.start();
                }
            }
        }
        this.o.clear();
        s();
    }

    public void y(long j, long j2) {
        long j3 = this.p;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.m = false;
            t(this, dgo.a, z);
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.z = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.m = true;
        }
        t(this, dgo.b, z);
    }

    protected final void z() {
        if (this.l == 0) {
            t(this, dgo.a, false);
            this.m = false;
        }
        this.l++;
    }

    public void H() {
    }

    public void I() {
    }

    public void o(dgy dgyVar) {
    }
}
