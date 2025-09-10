package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.creativebutton.CreativeButton;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sj implements url {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, utj] */
    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) throws Resources.NotFoundException {
        switch (this.b) {
            case 0:
                ((sl) this.a).h(wu.a);
                return ufg.a;
            case 1:
                byi byiVar = (byi) obj;
                if (byiVar instanceof wt) {
                    String str = ((wt) byiVar).a;
                    sl slVar = (sl) this.a;
                    if (!a.ao(str, slVar.b())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    slVar.h(byiVar);
                } else if (byiVar instanceof wv) {
                    String str2 = ((wv) byiVar).a;
                    sl slVar2 = (sl) this.a;
                    if (!a.ao(str2, slVar2.b())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    slVar2.h(byiVar);
                }
                return ufg.a;
            case 2:
                byi byiVar2 = (byi) obj;
                if (byiVar2 instanceof wt) {
                    Object objA = ((sp) this.a).g.a(byiVar2, uhbVar);
                    if (objA == uhi.a) {
                        return objA;
                    }
                } else {
                    if (!(byiVar2 instanceof wv)) {
                        if (!(byiVar2 instanceof wu)) {
                            return ufg.a;
                        }
                        Object obj2 = this.a;
                        ufg ufgVar = ufg.a;
                        Object objA2 = ((sp) obj2).d.a(ufgVar, uhbVar);
                        return objA2 == uhi.a ? objA2 : ufgVar;
                    }
                    Object objA3 = ((sp) this.a).g.a(byiVar2, uhbVar);
                    if (objA3 == uhi.a) {
                        return objA3;
                    }
                }
                return ufg.a;
            case 3:
                Object obj3 = this.a;
                byi byiVar3 = (byi) obj;
                synchronized (((us) obj3).d) {
                    if (byiVar3 instanceof te) {
                        uq uqVar = new uq((rm) ((te) byiVar3).a);
                        ((us) obj3).f = uqVar;
                        ((us) obj3).b(new te(uqVar));
                    } else {
                        ((us) obj3).b(byiVar3);
                    }
                }
                return ufg.a;
            case 4:
                ((bzt) this.a).b(((Number) obj).floatValue());
                return ufg.a;
            case 5:
                gwv gwvVar = (gwv) this.a;
                gvg gvgVar = gwvVar.b;
                gyd gydVar = (gyd) obj;
                gvgVar.e();
                gvk gvkVar = (gvk) gwvVar.S.h.c();
                if (gvkVar != null) {
                    gvgVar.d(gvkVar.d);
                }
                if (gydVar != null) {
                    gvgVar.f(gydVar);
                }
                return ufg.a;
            case 6:
                ((gwv) this.a).o((gvk) obj);
                return ufg.a;
            default:
                mxj mxjVar = (mxj) obj;
                CreativeButton creativeButton = (CreativeButton) this.a;
                if (creativeButton.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = creativeButton.getLayoutParams();
                    layoutParams.getClass();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (mxjVar.equals(mxj.TABLET_LAYOUT)) {
                        layoutParams2.gravity = 8388627;
                        if (((Boolean) creativeButton.e().m.a()).booleanValue()) {
                            layoutParams2.gravity = 8388611;
                            layoutParams2.leftMargin = creativeButton.getResources().getDimensionPixelOffset(R.dimen.creative_button_freeway_left_margin);
                        } else {
                            layoutParams2.leftMargin = creativeButton.getResources().getDimensionPixelOffset(R.dimen.creative_button_left_margin);
                        }
                        layoutParams2.rightMargin = 0;
                        creativeButton.setLayoutParams(layoutParams2);
                    } else {
                        layoutParams2.gravity = 8388629;
                        layoutParams2.leftMargin = 0;
                        layoutParams2.rightMargin = creativeButton.getResources().getDimensionPixelOffset(R.dimen.creative_button_right_margin);
                        creativeButton.setLayoutParams(layoutParams2);
                    }
                }
                return ufg.a;
        }
    }
}
