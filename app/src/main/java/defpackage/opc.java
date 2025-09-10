package defpackage;

import android.content.IntentFilter;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class opc implements ogt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ opc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ogt
    public final void a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            tyq tyqVar = new tyq((ogn) this.a, 1);
            ((opt) obj).I((tyq) this.b, tyqVar, new ope((oet) this.c, (pfl) obj2, tyqVar));
            return;
        }
        if (i == 1) {
            int i2 = onm.a;
            onp onpVar = new onp((pfl) obj2);
            onq onqVar = (onq) ((onr) obj).t();
            String[] strArr = {(String) this.a};
            Parcel parcelA = onqVar.a();
            fbj.d(parcelA, onpVar);
            parcelA.writeString("__internal.external_ids#".concat((String) this.c));
            parcelA.writeInt(0);
            parcelA.writeStringArray(strArr);
            parcelA.writeIntArray((int[]) this.b);
            parcelA.writeByteArray(null);
            onqVar.A(2, parcelA);
            return;
        }
        otq otqVar = (otq) obj;
        otl otlVar = new otl((pfl) obj2, 0);
        pfl pflVar = otqVar.t;
        otr otrVar = new otr((IntentFilter[]) this.b);
        otrVar.a = (ogn) this.c;
        ?? r1 = pflVar.a;
        Object obj3 = this.a;
        synchronized (r1) {
            if (r1.get(obj3) != null) {
                otlVar.d(new Status(4001));
                return;
            }
            r1.put(obj3, otrVar);
            try {
                ((osr) otqVar.t()).e(new ost(r1, obj3, otlVar), new oqo(otrVar));
            } catch (RemoteException e) {
                pflVar.a.remove(obj3);
                throw e;
            }
        }
    }

    public /* synthetic */ opc(oqf oqfVar, ogn ognVar, IntentFilter[] intentFilterArr, int i) {
        this.d = i;
        this.a = oqfVar;
        this.c = ognVar;
        this.b = intentFilterArr;
    }
}
