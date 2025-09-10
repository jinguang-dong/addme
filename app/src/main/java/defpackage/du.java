package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class du {
    public final dq a;
    private final int b;

    public du(Context context) {
        this(context, dv.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public dv b() {
        ListAdapter dnVar;
        dq dqVar = this.a;
        Context context = dqVar.a;
        dv dvVar = new dv(context, this.b);
        dt dtVar = dvVar.a;
        View view = dqVar.e;
        if (view != null) {
            dtVar.x = view;
        } else {
            CharSequence charSequence = dqVar.d;
            if (charSequence != null) {
                dtVar.a(charSequence);
            }
            Drawable drawable = dqVar.c;
            if (drawable != null) {
                dtVar.t = drawable;
                dtVar.s = 0;
                ImageView imageView = dtVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    dtVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dqVar.f;
        if (charSequence2 != null) {
            dtVar.e = charSequence2;
            TextView textView = dtVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dqVar.g;
        if (charSequence3 != null) {
            dtVar.e(-1, charSequence3, dqVar.h);
        }
        CharSequence charSequence4 = dqVar.i;
        if (charSequence4 != null) {
            dtVar.e(-2, charSequence4, dqVar.j);
        }
        if (dqVar.n != null || dqVar.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dqVar.b.inflate(dtVar.C, (ViewGroup) null);
            if (dqVar.t) {
                dnVar = new dn(dqVar, context, dtVar.D, dqVar.n, alertController$RecycleListView);
            } else {
                int i = dqVar.u ? dtVar.E : dtVar.F;
                ListAdapter dsVar = dqVar.o;
                if (dsVar == null) {
                    dsVar = new ds(context, i, dqVar.n);
                }
                dnVar = dsVar;
            }
            dtVar.y = dnVar;
            dtVar.z = dqVar.v;
            if (dqVar.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0000do(dqVar, dtVar));
            } else if (dqVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new dp(dqVar, alertController$RecycleListView, dtVar));
            }
            if (dqVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (dqVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            dtVar.f = alertController$RecycleListView;
        }
        View view2 = dqVar.r;
        if (view2 != null) {
            dtVar.g = view2;
            dtVar.h = 0;
            dtVar.i = false;
        } else {
            int i2 = dqVar.q;
            if (i2 != 0) {
                dtVar.g = null;
                dtVar.h = i2;
                dtVar.i = false;
            }
        }
        dvVar.setCancelable(dqVar.k);
        if (dqVar.k) {
            dvVar.setCanceledOnTouchOutside(true);
        }
        dvVar.setOnCancelListener(null);
        dvVar.setOnDismissListener(dqVar.l);
        DialogInterface.OnKeyListener onKeyListener = dqVar.m;
        if (onKeyListener != null) {
            dvVar.setOnKeyListener(onKeyListener);
        }
        return dvVar;
    }

    public final dv c() {
        dv dvVarB = b();
        dvVarB.show();
        return dvVarB;
    }

    public final void d(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void e(DialogInterface.OnKeyListener onKeyListener) {
        this.a.m = onKeyListener;
    }

    public final void f(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void g(View view) {
        dq dqVar = this.a;
        dqVar.r = view;
        dqVar.q = 0;
    }

    public final void h(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        dq dqVar = this.a;
        dqVar.i = charSequence;
        dqVar.j = onClickListener;
    }

    public final void j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        dq dqVar = this.a;
        dqVar.g = charSequence;
        dqVar.h = onClickListener;
    }

    public du(Context context, int i) {
        this.a = new dq(new ContextThemeWrapper(context, dv.a(context, i)));
        this.b = i;
    }
}
