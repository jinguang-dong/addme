package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mnd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mnd(int i, int i2, dts dtsVar, dtw dtwVar, int i3) {
        this.e = i3;
        this.a = i;
        this.b = i2;
        this.d = dtsVar;
        this.c = dtwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            Object obj = this.c;
            Object obj2 = this.d;
            dts.$r8$lambda$ejBVDgJJoSxAhsjcPWpzIdNJCB0(this.a, this.b, (dts) obj2, (dtw) obj);
            return;
        }
        View view = (View) this.d;
        Context context = view.getContext();
        int i = this.a;
        mni mniVar = (mni) this.c;
        ViewGroup viewGroupD = mniVar.d(i, context, R.style.Theme_BottomSheet_DayNight);
        viewGroupD.addView(view);
        mniVar.g(viewGroupD);
        if (mniVar.c != null) {
            mniVar.l(this.b, null, rvk.a);
            mniVar.c.show();
        }
    }

    public /* synthetic */ mnd(mni mniVar, int i, View view, int i2, int i3) {
        this.e = i3;
        this.c = mniVar;
        this.a = i;
        this.d = view;
        this.b = i2;
    }
}
