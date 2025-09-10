package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bur implements Comparator {
    private final /* synthetic */ int c;
    public static final bur b = new bur(6);
    public static final bur a = new bur(2);

    public bur(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            bvm bvmVar = (bvm) obj;
            bvm bvmVar2 = (bvm) obj2;
            int iA = ujp.a(bvmVar.j, bvmVar2.j);
            return iA != 0 ? iA : ujp.a(bvmVar.hashCode(), bvmVar2.hashCode());
        }
        if (i == 1) {
            jn jnVar = (jn) obj;
            jn jnVar2 = (jn) obj2;
            RecyclerView recyclerView = jnVar.d;
            if ((recyclerView == null) != (jnVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = jnVar.a;
            if (z != jnVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = jnVar2.b - jnVar.b;
            if (i2 == 0 && (i2 = jnVar.c - jnVar2.c) == 0) {
                return 0;
            }
            return i2;
        }
        if (i == 2) {
            bvm bvmVar3 = (bvm) obj;
            bvm bvmVar4 = (bvm) obj2;
            int iA2 = ujp.a(bvmVar4.j, bvmVar3.j);
            return iA2 != 0 ? iA2 : ujp.a(bvmVar3.hashCode(), bvmVar4.hashCode());
        }
        if (i == 3) {
            int[] iArr = con.a;
            float fA = cog.a((View) obj);
            float fA2 = cog.a((View) obj2);
            if (fA > fA2) {
                return -1;
            }
            return fA < fA2 ? 1 : 0;
        }
        if (i == 4) {
            return ((did) obj).b - ((did) obj2).b;
        }
        if (i == 5) {
            long jA = ((oxj) obj).a();
            long jA2 = ((oxj) obj2).a();
            if (jA < jA2) {
                return 1;
            }
            return jA > jA2 ? -1 : 0;
        }
        pas pasVar = (pas) obj;
        pas pasVar2 = (pas) obj2;
        int iCompare = Long.compare(pasVar.b(), pasVar2.b());
        if (iCompare == 0) {
            iCompare = Integer.compare(Math.min(pasVar.a, pasVar.b), Math.min(pasVar2.a, pasVar2.b));
        }
        return iCompare == 0 ? Integer.compare(pasVar.a, pasVar2.a) : iCompare;
    }
}
