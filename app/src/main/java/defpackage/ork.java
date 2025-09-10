package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ork extends oix {
    public static final Parcelable.Creator CREATOR = new oks(17);
    public final Uri a;
    public byte[] b;
    private final Map c;

    public ork(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        ojl.ay(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            ojl.ay(parcelable);
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.c = map;
        this.b = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iU = ojl.u(parcel);
        ojl.I(parcel, 2, uri, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        ojl.ay(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((oqa) entry.getValue()));
        }
        ojl.C(parcel, 4, bundle);
        ojl.D(parcel, 5, this.b);
        ojl.w(parcel, iU);
    }
}
