package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcw {
    public static Uri a(Context context, Uri uri) throws IOException, ErrnoException {
        try {
            String str = Os.readlink(qpt.Z(uri, context).getAbsolutePath());
            if (str == null) {
                throw new IOException("Unable to read symlink");
            }
            Pattern pattern = rcl.a;
            rck rckVar = new rck(context);
            rckVar.b(str);
            return rckVar.a();
        } catch (ErrnoException | rcu e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) {
        try {
            Os.symlink(qpt.Z(uri2, context).getAbsolutePath(), qpt.Z(uri, context).getAbsolutePath());
        } catch (ErrnoException | rcu e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
