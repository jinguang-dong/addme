package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dp implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ dt b;
    final /* synthetic */ dq c;

    public dp(dq dqVar, AlertController$RecycleListView alertController$RecycleListView, dt dtVar) {
        this.c = dqVar;
        this.a = alertController$RecycleListView;
        this.b = dtVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dq dqVar = this.c;
        boolean[] zArr = dqVar.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        dqVar.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
