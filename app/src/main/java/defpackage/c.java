package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    private static final Properties a;

    public static String a() {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = (String) AccessController.doPrivileged(new b());
            } catch (AccessControlException unused) {
                property = null;
            }
        } else {
            property = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        return property == null ? a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL") : property;
    }

    static {
        Properties properties = new Properties();
        a = properties;
        try {
            InputStream resourceAsStream = System.getSecurityManager() != null ? (InputStream) AccessController.doPrivileged(new d(e.class)) : e.class.getResourceAsStream(UvOvSgfD.bgkDrDAGJM);
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }
}
