package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpk implements nan {
    private final View a;
    private final TextView b;
    private final owf c;
    private Date d;
    private final mwq e;

    public fpk(View view, owf owfVar, mwq mwqVar) {
        this.a = view;
        this.c = owfVar;
        this.b = (TextView) view.findViewById(R.id.notification_text);
        this.e = mwqVar;
    }

    private final void a() {
        if (((Boolean) this.c.dL()).booleanValue()) {
            return;
        }
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            this.e.h(textView.getText());
        }
    }

    @Override // defpackage.imj
    public final int b() {
        return 0;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.NOTIFICATION_CHIP;
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.d;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // defpackage.imj
    public final void i() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.d = date;
    }

    @Override // defpackage.nan
    public final void l(String str) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        textView.setText(str);
        if (text != str) {
            a();
        }
    }

    @Override // defpackage.imj
    public final void m() {
        new Date();
        this.a.setVisibility(0);
        a();
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return 3;
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.imj
    public final /* synthetic */ void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
    }
}
