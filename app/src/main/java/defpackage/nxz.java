package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxz implements View.OnGenericMotionListener {
    public RecyclerView a;
    private final Runnable b = new ntd(this, 10);
    private final cnh c;
    private nyf d;

    public nxz(cnh cnhVar) {
        this.c = cnhVar;
    }

    static /* synthetic */ nyf a(RecyclerView recyclerView) {
        nyf nyfVar = new nyf(recyclerView.getContext(), recyclerView);
        nyfVar.a = false;
        nyfVar.b = false;
        return nyfVar;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 8 || !motionEvent.isFromSource(4194304) || !view.isActivated()) {
            return false;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        this.a = recyclerView;
        if (this.d == null) {
            nyf nyfVarA = a(recyclerView);
            this.d = nyfVarA;
            this.c.accept(nyfVarA);
        }
        Runnable runnable = this.b;
        view.removeCallbacks(runnable);
        view.postDelayed(runnable, 80L);
        Context context = view.getContext();
        int iRound = Math.round((-motionEvent.getAxisValue(26)) * ViewConfiguration.get(context).getScaledVerticalScrollFactor());
        if (iRound == 0) {
            return true;
        }
        view.scrollBy(0, iRound);
        return true;
    }
}
