package defpackage;

import android.widget.LinearLayout;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import j$.util.Map;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class krd implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ krd(OptionsMenuView optionsMenuView, krs krsVar, int i) {
        this.c = i;
        this.b = optionsMenuView;
        this.a = krsVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, tzj] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.c;
        if (i == 0) {
            krz krzVar = (krz) obj;
            if (((krs) this.a).equals(krzVar.h())) {
                if (!((ksa) this.b).equals(krzVar.j().dL())) {
                    return true;
                }
            }
            return false;
        }
        if (i == 1) {
            krz krzVar2 = (krz) obj;
            if (((krs) this.a).equals(krzVar2.h())) {
                if (!((ksa) this.b).equals(krzVar2.j().dL())) {
                    return true;
                }
            }
            return false;
        }
        if (i == 2) {
            sgv sgvVar = ktb.a;
            return ((Boolean) ((oww) this.a).dL()).booleanValue() && !((Boolean) ((ovx) ((FocusIndicatorView) this.b.a()).j).d).booleanValue();
        }
        if (i == 3) {
            kto ktoVar = (kto) obj;
            if (((krs) this.a).equals(ktoVar.g())) {
                if (!((ksa) this.b).equals(ktoVar.p)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 4) {
            if (i != 5) {
                ?? r0 = this.a;
                Pattern pattern = mbc.a;
                return Map.EL.putIfAbsent(r0, this.b.apply(obj), Boolean.TRUE) == null;
            }
            ?? r02 = this.a;
            int i2 = mah.f;
            return Map.EL.putIfAbsent(r02, this.b.apply(obj), Boolean.TRUE) == null;
        }
        kto ktoVar2 = (kto) obj;
        if (!ktoVar2.g().equals(this.a)) {
            return false;
        }
        LinearLayout linearLayout = ((OptionsMenuView) this.b).l;
        linearLayout.getClass();
        linearLayout.removeView(ktoVar2);
        ksa ksaVar = ktoVar2.p;
        return true;
    }

    public /* synthetic */ krd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
