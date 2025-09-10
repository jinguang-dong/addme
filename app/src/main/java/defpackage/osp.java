package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class osp extends fbi implements osq {
    public osp() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        osm osmVar;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) fbj.a(parcel, DataHolder.CREATOR);
                fbj.b(parcel);
                c(dataHolder);
                return true;
            case 2:
                osy osyVar = (osy) fbj.a(parcel, osy.CREATOR);
                fbj.b(parcel);
                d(osyVar);
                return true;
            case 3:
                fbj.b(parcel);
                k();
                return true;
            case 4:
                fbj.b(parcel);
                l();
                return true;
            case 5:
                parcel.createTypedArrayList(ota.CREATOR);
                fbj.b(parcel);
                h();
                return true;
            case 6:
                fbj.b(parcel);
                j();
                return true;
            case 7:
                orc orcVar = (orc) fbj.a(parcel, orc.CREATOR);
                fbj.b(parcel);
                b(orcVar);
                return true;
            case 8:
                fbj.b(parcel);
                g();
                return true;
            case 9:
                fbj.b(parcel);
                i();
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                osy osyVar2 = (osy) fbj.a(parcel, osy.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    osmVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    osmVar = iInterfaceQueryLocalInterface instanceof osm ? (osm) iInterfaceQueryLocalInterface : new osm(strongBinder);
                }
                fbj.b(parcel);
                f(osyVar2, osmVar);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fbj.b(parcel);
                return true;
            case 15:
                fbj.b(parcel);
                return true;
            case 16:
                osz oszVar = (osz) fbj.a(parcel, osz.CREATOR);
                fbj.b(parcel);
                e(oszVar);
                return true;
            case 17:
                fbj.b(parcel);
                return true;
        }
    }
}
