package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* renamed from: do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0000do implements AdapterView.OnItemClickListener {
    final /* synthetic */ dt a;
    final /* synthetic */ dq b;

    public C0000do(dq dqVar, dt dtVar) {
        this.b = dqVar;
        this.a = dtVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dt dtVar = this.a;
        dq dqVar = this.b;
        DialogInterface.OnClickListener onClickListener = dqVar.p;
        eq eqVar = dtVar.b;
        onClickListener.onClick(eqVar, i);
        if (dqVar.u) {
            return;
        }
        eqVar.dismiss();
    }
}
