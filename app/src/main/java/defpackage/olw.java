package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olw extends fbi implements olx {
    public final omj a;

    public olw() {
        super(MyBPCgKwEjJI.qlzPYTBhGxHu);
    }

    @Override // defpackage.olx
    public final void e() {
        this.a.b().b(new omn(this, 0));
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Location location = (Location) fbj.a(parcel, Location.CREATOR);
            fbj.b(parcel);
            this.a.b().b(new omn(location, 1));
        } else {
            if (i != 2) {
                return false;
            }
            e();
        }
        return true;
    }

    public olw(omj omjVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = omjVar;
    }
}
