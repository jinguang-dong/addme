package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxn extends li {
    public final CenteredRecyclerView c;
    public final Runnable d;
    public final Runnable e;
    public boolean f;
    public final int g;
    public int h;
    public final CharSequence i;
    private cnn j;

    public nxn(CenteredRecyclerView centeredRecyclerView) {
        CharSequence charSequence;
        super(centeredRecyclerView);
        this.d = new ntd(this, 8);
        this.e = new ntd(this, 9);
        this.g = -1;
        this.h = 0;
        this.c = centeredRecyclerView;
        Resources.Theme theme = centeredRecyclerView.getContext().getTheme();
        if (theme == null) {
            charSequence = null;
        } else {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.accessibilityActionForItemSelection, typedValue, true);
            charSequence = typedValue.string;
        }
        this.i = charSequence == null ? centeredRecyclerView.getResources().getString(R.string.wear_picker_a11y_action_select_item) : charSequence;
        nwj nwjVar = new nwj();
        centeredRecyclerView.aH();
        centeredRecyclerView.ae.add(nwjVar);
        centeredRecyclerView.az(new nxl(this));
    }

    private final void l() {
        this.c.aH();
    }

    @Override // defpackage.li, defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        CenteredRecyclerView centeredRecyclerView = this.c;
        kq kqVar = centeredRecyclerView.m;
        if (kqVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kqVar;
            int i = linearLayoutManager.k;
            int iAp = linearLayoutManager.ap();
            int i2 = 1 != i ? 1 : iAp;
            if (1 == i) {
                iAp = 1;
            }
            cptVar.o(ejs.q(i2, iAp, 1));
            centeredRecyclerView.aH();
            cptVar.H(cps.n);
            cptVar.H(cps.m);
        }
    }

    @Override // defpackage.cnn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        CenteredRecyclerView centeredRecyclerView = this.c;
        int iC = centeredRecyclerView.c(view);
        centeredRecyclerView.aH();
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 128) {
            return iC == -1;
        }
        if (eventType == 32768) {
            centeredRecyclerView.removeCallbacks(this.e);
            int i = this.h;
            this.f = true;
            return i != 0;
        }
        if (eventType != 65536) {
            return true;
        }
        Runnable runnable = this.e;
        centeredRecyclerView.removeCallbacks(runnable);
        centeredRecyclerView.post(runnable);
        return true;
    }

    @Override // defpackage.li, defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            l();
            return false;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        l();
        return false;
    }

    @Override // defpackage.li
    public final cnn j() {
        if (this.j == null) {
            this.j = new nxm(this);
        }
        return this.j;
    }
}
