package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rbx implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rbx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        int i2 = this.b;
        if (i2 == 0) {
            rbw rbwVar = (rbw) adapterView.getItemAtPosition(i);
            LicenseMenuActivity licenseMenuActivity = ((rby) this.a).b;
            if (licenseMenuActivity != null) {
                Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                intent.putExtra("license", rbwVar);
                licenseMenuActivity.startActivity(intent);
                return;
            }
            return;
        }
        if (i2 == 1) {
            Object obj = this.a;
            C0001if c0001if = (C0001if) obj;
            ii iiVar = c0001if.d;
            iiVar.setSelection(i);
            if (iiVar.getOnItemClickListener() != null) {
                iiVar.performItemClick(view, i, c0001if.b.getItemId(i));
            }
            ((jz) obj).k();
            return;
        }
        if (i < 0) {
            jz jzVar = ((rpw) this.a).a;
            item = !jzVar.u() ? null : jzVar.e.getSelectedItem();
        } else {
            item = ((rpw) this.a).getAdapter().getItem(i);
        }
        rpw rpwVar = (rpw) this.a;
        rpwVar.setText(rpwVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = rpwVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                jz jzVar2 = rpwVar.a;
                View selectedView = jzVar2.u() ? jzVar2.e.getSelectedView() : null;
                i = jzVar2.o();
                j = !jzVar2.u() ? Long.MIN_VALUE : jzVar2.e.getSelectedItemId();
                view2 = selectedView;
            } else {
                view2 = view;
            }
            onItemClickListener.onItemClick(rpwVar.a.e, view2, i, j);
        }
        rpwVar.a.k();
    }

    public /* synthetic */ rbx(rby rbyVar, int i) {
        this.b = i;
        this.a = rbyVar;
    }
}
