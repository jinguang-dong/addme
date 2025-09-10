package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.cameravisionkit.NewQrGleamingView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rht implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ rht(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, rnx rnxVar, Integer num, int i) {
        this.f = i;
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.d = rnxVar;
        this.e = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        if (this.f == 0) {
            int iR = qpt.R(((ColorStateList) this.b).getDefaultColor(), ((ColorStateList) this.c).getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iR);
            rnx rnxVar = (rnx) this.d;
            rnxVar.n(colorStateListValueOf);
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            if (appBarLayout.i != null && (num = appBarLayout.j) != null && num.equals(this.e)) {
                appBarLayout.i.setTint(iR);
            }
            List<rhy> list = appBarLayout.g;
            if (!list.isEmpty()) {
                for (rhy rhyVar : list) {
                    if (rnxVar.g() != null) {
                        rhyVar.a();
                    }
                }
            }
            LinkedHashSet linkedHashSet = appBarLayout.h;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((rhz) it.next()).a();
            }
            return;
        }
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("alpha")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("fadeInGap")).intValue();
        int i = -iIntValue2;
        gqt gqtVar = (gqt) this.d;
        Rect rect = gqtVar.a;
        rect.offset(i, iIntValue2);
        Rect rect2 = gqtVar.b;
        rect2.offset(iIntValue2, iIntValue2);
        Rect rect3 = gqtVar.c;
        rect3.offset(i, i);
        Rect rect4 = gqtVar.d;
        rect4.offset(iIntValue2, i);
        gqv gqvVar = (gqv) this.e;
        gqvVar.a(rect, rect2, rect3, rect4);
        rect.offset(iIntValue2, i);
        rect2.offset(i, i);
        rect3.offset(iIntValue2, iIntValue2);
        rect4.offset(i, iIntValue2);
        gqvVar.a.setAlpha(iIntValue);
        gqvVar.b.setAlpha(iIntValue);
        gqvVar.c.setAlpha(iIntValue);
        gqvVar.d.setAlpha(iIntValue);
        NewQrGleamingView newQrGleamingView = ((gqy) this.a).a;
        newQrGleamingView.c((Point) this.b, (Rect) this.c);
        newQrGleamingView.invalidate();
    }

    public /* synthetic */ rht(gqv gqvVar, gqt gqtVar, gqs gqsVar, Point point, Rect rect, int i) {
        this.f = i;
        this.e = gqvVar;
        this.d = gqtVar;
        this.a = gqsVar;
        this.b = point;
        this.c = rect;
    }
}
