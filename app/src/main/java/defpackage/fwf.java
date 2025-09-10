package defpackage;

import android.os.AsyncTask;
import android.os.Process;
import androidx.wear.ambient.AmbientDelegate;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwf extends AsyncTask {
    final /* synthetic */ AmbientDelegate a;

    public fwf(AmbientDelegate ambientDelegate) {
        this.a = ambientDelegate;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, pbn] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(11);
        AmbientDelegate ambientDelegate = this.a;
        ambientDelegate.b.f("RemoveDeletedCacheTask");
        File[] fileArrListFiles = new File(((String[]) objArr)[0]).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                ?? r3 = ambientDelegate.c;
                synchronized (r3) {
                    if (file.isDirectory() && !r3.contains(file.toString())) {
                        ambientDelegate.z(file);
                    }
                }
                if (isCancelled()) {
                    break;
                }
            }
        }
        this.a.b.g();
        return null;
    }
}
