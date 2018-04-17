package benchmark.rpc.netty.server.codec;

import benchmark.rpc.netty.serializer.ProtostuffSerializer;
import benchmark.rpc.protocol.Response;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ProtocolEncoder extends MessageToByteEncoder<Response> {

	protected void encode(ChannelHandlerContext ctx, Response response, ByteBuf buffer) throws Exception {
		ProtostuffSerializer.writeResponse(buffer, response);
	}

}
