package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ak implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ak(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new al(parcel);
            case 1:
                return new aj(parcel);
            case 2:
                return new cc(parcel);
            case 3:
                return new ci(parcel);
            case 4:
                return new cm(parcel);
            case 5:
                return new ig(parcel);
            case 6:
                return new jv(parcel);
            case 7:
                return new lr(parcel);
            case 8:
                return new lt(parcel);
            case 9:
                parcel.getClass();
                return new oa(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new oj((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                return new cqk(parcel);
            case 12:
                return new dab(parcel);
            case 13:
                return new dae(parcel);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dah(parcel);
            case 15:
                return new dak(parcel);
            case 16:
                return new daw(parcel);
            case 17:
                return new dbk(parcel);
            case 18:
                return new dbm(parcel);
            case 19:
                return new ParcelImpl(parcel);
            default:
                return new eff(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new al[i];
            case 1:
                return new aj[i];
            case 2:
                return new cc[i];
            case 3:
                return new ci[i];
            case 4:
                return new cm[i];
            case 5:
                return new ig[i];
            case 6:
                return new jv[i];
            case 7:
                return new lr[i];
            case 8:
                return new lt[i];
            case 9:
                return new oa[i];
            case 10:
                return new oj[i];
            case 11:
                return new cqk[i];
            case 12:
                return new dab[i];
            case 13:
                return new dae[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dah[i];
            case 15:
                return new dak[i];
            case 16:
                return new daw[i];
            case 17:
                return new dbk[i];
            case 18:
                return new dbm[i];
            case 19:
                return new ParcelImpl[i];
            default:
                return new eff[i];
        }
    }
}
