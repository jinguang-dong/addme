package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzi implements View.OnLayoutChangeListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzi(SmartsChipView smartsChipView, lyr lyrVar, int i) {
        this.c = i;
        this.a = smartsChipView;
        this.b = lyrVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mxu mxuVarG;
        if (this.c != 0) {
            lxc lxcVarA = lxd.a((lyr) this.b);
            lxcVarA.c(true);
            SmartsChipView smartsChipView = (SmartsChipView) this.a;
            lxcVarA.f(smartsChipView.h);
            lxcVarA.b(smartsChipView.j);
            lxcVarA.d(smartsChipView.i);
            lxcVarA.g(smartsChipView.k);
            lxcVarA.h(smartsChipView.l);
            lxcVarA.e(smartsChipView.m);
            smartsChipView.c(lxcVarA.a());
            return;
        }
        mzk mzkVar = (mzk) this.b;
        if ((mzkVar.h.k() || mzkVar.h.j()) && (mxuVarG = ((MainActivityLayout) this.a).g()) != null) {
            Context context = mzkVar.e;
            mxt mxtVar = mxuVarG.a;
            boolean zIsInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
            boolean zEquals = mxtVar.j.equals(mxj.TABLET_LAYOUT);
            mxm mxmVar = mxtVar.h;
            if (!zEquals || zIsInMultiWindowMode) {
                mzkVar.f.e(false, mxmVar);
            } else {
                mzkVar.f.e(true, mxmVar);
            }
        }
    }

    public mzi(mzk mzkVar, MainActivityLayout mainActivityLayout, int i) {
        this.c = i;
        this.a = mainActivityLayout;
        this.b = mzkVar;
    }
}
