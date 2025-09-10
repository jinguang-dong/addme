package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coz extends WindowInsetsAnimation.Callback {
    private final coy a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public coz(coy coyVar) {
        super(coyVar.a);
        this.d = new HashMap();
        this.a = coyVar;
    }

    private final sgh a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        sgh sghVar = (sgh) map.get(windowInsetsAnimation);
        if (sghVar != null) {
            return sghVar;
        }
        sgh sghVar2 = new sgh(windowInsetsAnimation);
        map.put(windowInsetsAnimation, sghVar2);
        return sghVar2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                coy coyVar = this.a;
                cpp cppVarN = cpp.n(windowInsets);
                coyVar.c(cppVarN, this.b);
                return cppVarN.e();
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            sgh sghVarA = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) ((ocq) sghVarA.a).a).setFraction(windowInsetsAnimation.getFraction());
            this.c.add(sghVarA);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        sgh sghVarA = a(windowInsetsAnimation);
        cox coxVar = new cox(bounds);
        this.a.e(sghVarA);
        return new WindowInsetsAnimation.Bounds(coxVar.a.a(), coxVar.b.a());
    }
}
