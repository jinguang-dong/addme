package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ic implements DialogInterface.OnClickListener, ih {
    dv a;
    final /* synthetic */ ii b;
    private ListAdapter c;
    private CharSequence d;

    public ic(ii iiVar) {
        this.b = iiVar;
    }

    @Override // defpackage.ih
    public final int a() {
        return 0;
    }

    @Override // defpackage.ih
    public final int b() {
        return 0;
    }

    @Override // defpackage.ih
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.ih
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.ih
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.ih
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ih
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ih
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ih
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.ih
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ih
    public final void k() {
        dv dvVar = this.a;
        if (dvVar != null) {
            dvVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ih
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        ii iiVar = this.b;
        du duVar = new du(iiVar.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            duVar.f(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = iiVar.getSelectedItemPosition();
        dq dqVar = duVar.a;
        dqVar.o = listAdapter;
        dqVar.p = this;
        dqVar.v = selectedItemPosition;
        dqVar.u = true;
        dv dvVarB = duVar.b();
        this.a = dvVarB;
        ListView listView = dvVarB.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ii iiVar = this.b;
        iiVar.setSelection(i);
        if (iiVar.getOnItemClickListener() != null) {
            iiVar.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.ih
    public final boolean u() {
        dv dvVar = this.a;
        if (dvVar != null) {
            return dvVar.isShowing();
        }
        return false;
    }
}
