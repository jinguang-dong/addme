package defpackage;

import android.graphics.Bitmap;
import android.support.v8.renderscript.Allocation;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mn {
    public static /* synthetic */ String b(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String d(long j, String str) {
        return str + j + ')';
    }

    public static /* synthetic */ String e(byte b, Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj + ((char) b);
    }

    public static /* synthetic */ String f(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String g(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String h(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String i(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String j(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String a(Allocation allocation, Bitmap.Config config, StringBuilder sb) {
        sb.append("Allocation kind is ");
        sb.append(allocation.mType.getElement().mKind);
        sb.append(qcjAcSmlN.OkIh);
        sb.append(allocation.mType.getElement().mType);
        sb.append(" of ");
        sb.append(allocation.mType.getElement().getBytesSize());
        sb.append(" bytes, passed bitmap was ");
        sb.append(config);
        return sb.toString();
    }
}
