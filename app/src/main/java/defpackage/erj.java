package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erj implements eqx {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public erj(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.eqx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.eqx
    public final void b() {
    }
}
