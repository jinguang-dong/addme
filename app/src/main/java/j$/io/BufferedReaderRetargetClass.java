package j$.io;

import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.BufferedReader;

/* loaded from: classes3.dex */
public final /* synthetic */ class BufferedReaderRetargetClass {
    public static Stream lines(BufferedReader bufferedReader) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new a(bufferedReader), 272), false);
    }
}
