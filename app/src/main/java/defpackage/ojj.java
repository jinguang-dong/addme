package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojj {
    public static final /* synthetic */ int a = 0;

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        Pattern.compile(oUZhwRhE.XyKPeXiMuYXbaSF);
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }
}
