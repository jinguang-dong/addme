package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dib implements cny {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public dib(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.cny
    public final cpp a(View view, cpp cppVar) {
        cpp cppVarC = con.c(view, cppVar);
        if (cppVarC.r()) {
            return cppVarC;
        }
        Rect rect = this.b;
        rect.left = cppVarC.b();
        rect.top = cppVarC.d();
        rect.right = cppVarC.c();
        rect.bottom = cppVarC.a();
        ViewPager viewPager = this.a;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            cpp cppVarB = con.b(viewPager.getChildAt(i), cppVarC);
            rect.left = Math.min(cppVarB.b(), rect.left);
            rect.top = Math.min(cppVarB.d(), rect.top);
            rect.right = Math.min(cppVarB.c(), rect.right);
            rect.bottom = Math.min(cppVarB.a(), rect.bottom);
        }
        cpd cpdVar = new cpd(cppVarC);
        cpdVar.c(cmh.b(rect.left, rect.top, rect.right, rect.bottom));
        return cpdVar.a();
    }
}
