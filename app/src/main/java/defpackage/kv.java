package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kv {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final /* synthetic */ RecyclerView f;
    nll g;

    public kv(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.f;
            ld ldVar = recyclerView.O;
            if (i < ldVar.a()) {
                return !ldVar.g ? i : recyclerView.aa.b(i);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.f;
        sb.append(recyclerView2.O.a());
        sb.append(recyclerView2.l());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final View b(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    final void c(lg lgVar, boolean z) {
        RecyclerView.u(lgVar);
        RecyclerView recyclerView = this.f;
        View view = lgVar.a;
        li liVar = recyclerView.S;
        if (liVar != null) {
            cnn cnnVarJ = liVar.j();
            con.i(view, cnnVarJ instanceof lh ? (cnn) ((lh) cnnVarJ).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.n;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((kw) list.get(i)).a();
            }
            if (recyclerView.O != null) {
                recyclerView.ac.C(lgVar);
            }
        }
        lgVar.r = null;
        lgVar.q = null;
        nll nllVarP = p();
        int i2 = lgVar.f;
        ArrayList arrayList = nllVarP.k(i2).a;
        int i3 = ((ku) ((SparseArray) nllVarP.b).get(i2)).b;
        if (arrayList.size() >= 5) {
            col.c(view);
        } else {
            lgVar.k();
            arrayList.add(lgVar);
        }
    }

    public final void d() {
        this.a.clear();
        h();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void e() {
        RecyclerView recyclerView;
        ki kiVar;
        nll nllVar = this.g;
        if (nllVar == null || (kiVar = (recyclerView = this.f).l) == null || !recyclerView.r) {
            return;
        }
        nllVar.c.add(kiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void f(ki kiVar, boolean z) {
        nll nllVar = this.g;
        if (nllVar == null) {
            return;
        }
        ?? r0 = nllVar.c;
        r0.remove(kiVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) nllVar.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((ku) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                col.c(((lg) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void g(View view) {
        lg lgVarI = RecyclerView.i(view);
        lgVarI.m = null;
        lgVarI.n = false;
        lgVarI.h();
        k(lgVarI);
    }

    public final void h() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                i(size);
            }
        }
        arrayList.clear();
        if (RecyclerView.b) {
            this.f.N.b();
        }
    }

    public final void i(int i) {
        int i2 = RecyclerView.ad;
        ArrayList arrayList = this.c;
        c((lg) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void j(View view) {
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI.w()) {
            this.f.removeDetachedView(view, false);
        }
        if (lgVarI.v()) {
            lgVarI.o();
        } else if (lgVarI.A()) {
            lgVarI.h();
        }
        k(lgVarI);
        RecyclerView recyclerView = this.f;
        if (recyclerView.E == null || lgVarI.t()) {
            return;
        }
        recyclerView.E.b(lgVarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k(defpackage.lg r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.k(lg):void");
    }

    final void l(View view) {
        kn knVar;
        lg lgVarI = RecyclerView.i(view);
        if (!lgVarI.p(12) && lgVarI.x() && (knVar = this.f.E) != null && !knVar.g(lgVarI, lgVarI.c())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            lgVarI.n(this, true);
            this.b.add(lgVarI);
            return;
        }
        if (lgVarI.s() && !lgVarI.u()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.l.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.l()));
            }
        }
        lgVarI.n(this, false);
        this.a.add(lgVarI);
    }

    public final void m(lg lgVar) {
        if (lgVar.n) {
            this.b.remove(lgVar);
        } else {
            this.a.remove(lgVar);
        }
        lgVar.m = null;
        lgVar.n = false;
        lgVar.h();
    }

    public final void n() {
        kq kqVar = this.f.m;
        this.e = (kqVar != null ? kqVar.y : 0) + 2;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.e) {
                return;
            } else {
                i(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [ki] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [lg] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.lg o(int r23, long r24) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.o(int, long):lg");
    }

    public final nll p() {
        if (this.g == null) {
            this.g = new nll();
            e();
        }
        return this.g;
    }
}
