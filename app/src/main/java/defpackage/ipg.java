package defpackage;

import android.graphics.Canvas;
import android.graphics.Typeface;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ipg implements cnh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cnh
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((ipk) this.a).q((dtp) obj);
            return;
        }
        if (i == 1) {
            super/*android.widget.EditText*/.setTypeface((Typeface) obj);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                ((WearPickerColumn) this.a).a((nyf) obj);
                return;
            } else {
                ((CenteredRecyclerView) this.a).aF((Canvas) obj);
                return;
            }
        }
        ipk ipkVar = (ipk) this.a;
        owq owqVar = ipkVar.p;
        dtp dtpVar = (dtp) obj;
        if (!((dtp) owqVar.dL()).equals(dtpVar)) {
            owqVar.dL();
            owqVar.a(dtpVar);
        }
        boolean zEquals = Objects.equals(dtpVar, dtp.e);
        owq owqVar2 = ipkVar.l;
        if (zEquals != ((Boolean) owqVar2.dL()).booleanValue()) {
            owqVar2.a(Boolean.valueOf(zEquals));
            if (!zEquals) {
                ipkVar.q.a(iqh.NONE);
            }
        }
        if (dtp.b.equals(dtpVar) || dtp.c.equals(dtpVar)) {
            ipkVar.b.e(fvv.WINDOW_AREA_STATUS_CHANGED);
        } else {
            ipkVar.b.f(fvv.WINDOW_AREA_STATUS_CHANGED);
        }
        owqVar2.dL();
    }
}
